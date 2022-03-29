package aprenderemosAfondo;

import java.time.LocalDate;

public class Cliente extends Persona{
	
	/*
	 * A - administracion
	 * E - empresa
	 * P - particular*/
private char tipo;
	
	
	
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String apellido, LocalDate fechaNacimiento,char tipo) {
		super(apellido,nombre,fechaNacimiento);
		this.tipo = tipo;
	}

	public static void main(String[] args) {
		Cliente c = new Cliente("Fernandez","JUAN",LocalDate.of(1980, 10, 18),'P');
	
		c.visualizacion();
	}
	
	public void visualizacion() {
	super.visualizacion();
	switch (tipo) {
	case 'A': {
		System.out.println("Administracion");
		break;
	}
	case 'E': {
		System.out.println("Empresa");
		break;
	}
	case 'P': {
		System.out.println("Particular");
		break;
	}
	default:
		System.out.println("No corresponde a ningun tipo de cliente");
		break;
	}
	
}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char t) {
		tipo=t;
	}

	

}
