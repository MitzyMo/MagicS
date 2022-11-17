package modelo;
public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
	  this.nombre = nombre;
	  this.edad = edad;
	}
	public Persona() {
	  this.nombre = "N.N.";
	  this.edad = 0;
	}
	@Override
	public String toString() {
	  return (nombre + " " + edad);
	}
	public void setNombre(String nombre) {
	  this.nombre = nombre;
	}
	public void setEdad(int edad) {
	  this.edad = edad;
	}
	public String getNombre() {
	  return this.nombre;
	}
	public int getEdad() { 
	  return this.edad;
	}
  } 