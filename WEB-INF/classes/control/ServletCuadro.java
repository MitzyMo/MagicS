package control;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.print.attribute.IntegerSyntax;
import javax.servlet.*;
import modelo.CuadroMagico;

@WebServlet("/ServletCuadro")
public class ServletCuadro extends HttpServlet {
  private CuadroMagico cm;
  public ServletCuadro() {
    super();
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int tamano = Integer.parseInt(request.getParameter("tamano"));
    int numIni = Integer.parseInt(request.getParameter("numIni"));
    cm = new CuadroMagico(tamano, numIni);
    int [][] matriz_magica = new int [tamano][tamano];
    cm.generar();
    matriz_magica = cm.getMatriz_magica();
    //cm.mostrarMatriz_magica();
    request.setAttribute("matriz", matriz_magica);
    request.setAttribute("tamano", cm.getTamano());
    request.getRequestDispatcher("/index.jsp").forward(request, response);

  }
} 