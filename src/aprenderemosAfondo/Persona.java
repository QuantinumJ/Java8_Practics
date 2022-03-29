package aprenderemosAfondo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
// Creacion de clase 
public class Persona {
	// Definicion de las variables o atributos de la clase 
	
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	
	// Campo privado presentado para el numero de persona
	private  int numero;
	// Campo estatico presentado para el contador de personas
	private static int numInstancias;
	
	public int getNumero() {
		return numero;
	}
	public static int getNumInstancias() {
		return numInstancias;
	}
	// metodo main
	public static void main(String[] args) {

	}
	// constructor
	public Persona() {
		nombre = "";
		apellido= "";
		fecha_nacimiento=null;
		numInstancias++;
		numero = numInstancias;
		
	}
	public Persona(String a,String n, LocalDate nac) {
		nombre=n;
		apellido=a;
		fecha_nacimiento = nac;
		// Crecimiento de numero de instacia y asignacion del numero
		
	}
	// metodos  Accesores get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
	nombre = nombre.toLowerCase();
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		apellido = apellido.toUpperCase();
	}
	
 //metodos generales
	
	public long calculoEdad() {
		return fecha_nacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
	}
}
