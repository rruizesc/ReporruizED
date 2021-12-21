package Staticos;

public class empleado {
	private String nombre;
	private String telefono;
	static private int numempleados;
	
	public empleado(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
		numempleados++;
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public static int getNumempleados() {
		return numempleados;
	}
	
	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
}
