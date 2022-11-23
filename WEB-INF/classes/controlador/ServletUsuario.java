package controlador;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import modelo.Persona;
import modelo.Magic;

@WebServlet("/ServletUsuario")

public class ServletUsuario extends HttpServlet {
  private Magic squareMagic;
    
  public ServletUsuario() {
    super();
    this.squareMagic = new Magic();
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int s  = request.getParameter("size"); 
    int valorI = request.getParameter("valorI");
    squareMagic.makeSquare(s);
    int edad = 0;
    if(!nombre.equals("") && paramEdad != null){
      edad = Integer.parseInt(paramEdad);
      curso.add(new Persona(nombre,edad));
    }  
    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }
}