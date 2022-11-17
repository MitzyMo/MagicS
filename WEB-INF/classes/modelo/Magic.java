package modelo;
import java.util.*;

public class Magic {
    private static ArrayList<Persona> listado;
    private String lista;

    public Magic() {
      this.listado = new ArrayList<Persona>();
    }
    
    @Override
    public String toString(){
      String resultado = "";
      for (var x : listado)
        resultado +=(x + "<br>");
      return resultado;
    }
    public boolean add(Persona persona) {
      return listado.add(persona);
    }
    public String getLista() {
      lista = toString();
      return lista;
    }
    public ArrayList<Persona> getListado() {
      return listado;
    }
  } 
