package controlador;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import modelo.Persona;
import modelo.Curso;

@WebServlet("/ServletUsuario")

public class ServletUsuario extends HttpServlet {
  private Curso curso;
    
  public ServletUsuario() {
    super();
    this.curso = new Curso();
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String nombre = request.getParameter("nombre"); 
    String paramEdad = request.getParameter("edad");
    int edad = 0;
    if(!nombre.equals("") && paramEdad != null){
      edad = Integer.parseInt(paramEdad);
      curso.add(new Persona(nombre,edad));
    }  
    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }
}