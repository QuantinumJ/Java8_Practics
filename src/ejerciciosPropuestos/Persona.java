package ejerciciosPropuestos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private ArrayList<Articulo> obras;
	
	public Persona () {
		super();
		obras = new ArrayList<>();
	}
	
	public Persona (String nombre, String apellido, LocalDate fecha_nacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public String toString() {
		
		return nombre+ " "+apellido;
	}
	public ArrayList<Articulo> getObras(){
		return obras;
	}
	

}
