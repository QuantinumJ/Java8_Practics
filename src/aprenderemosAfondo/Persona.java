package aprenderemosAfondo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
// Creacion de clase 
public class Persona {
	// Definicion de las variables o atributos de la clase 
	
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
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
	public static void main(String[] args) throws IOException {
		
		Persona[] tab;
		tab = new Persona[5];
		tab[0] = new Persona("juanito1", "nombre1", LocalDate.of(1911, 5, 25));
		tab[1] = new Persona("juanito2", "nombre2", LocalDate.of(1912, 1, 15));
		tab[2] = new Persona("juanito3", "nombre3", LocalDate.of(1955, 7, 28));
		tab[3] = new Persona("juanito4", "nombre4", LocalDate.of(1940, 1, 15));
		tab[4] = new Persona("juanito5", "nombre5", LocalDate.of(1970,9, 12));
		
//		Persona[] tabClasificacion;
//		tabClasificacion = (Persona[])clasificar(tab);
//		for(int i =0; i<tabClasificacion.length; i++) {
//			System.out.println(tabClasificacion[i]);
//		}
		
//		Persona nueva = new Persona();
//		nueva.apellido="Perez";
//		nueva.nombre = "Juan";
//		nueva.fecha_nacimiento = LocalDate.of(1960, 02, 28);
//		nueva.visualizacion();
		
//		tabClasificacion = (Persona[]) clasificar (tab, new Comparador(){
//			
//			public int compare(Object o1, Object o2) {
//				Persona p1,p2;
//				if(o1 instanceof Persona & o2 instanceof Persona ) {
//					p1 = (Persona)o1;
//					p2 = (Persona)o2;
//					
//				}else {
//					return Clasificable.ERROR;
//				}
//				if(p1.getApellido().compareTo(p2.getApellido())<0) {
//					return Clasificable.INFERIOR;
//				}
//				if(p1.getApellido().compareTo(p2.getApellido())>0) {
//					return Clasificable.SUPERIOR;
//				}
//				
//					return Clasificable.IGUAL;
//			
//				}
//			}
//			);
//		for (int i=0; i<tabClasificacion.length; i++) {
//			System.out.println(tabClasificacion[i]);
//		}
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		nombre = br.readLine();
		
		System.out.println(busquedaPersona(tab,  pe ->
			pe.getNombre().equals(nombre)));	
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
	
//	public static Clasificable[] clasificar(Clasificable[] array) {
//		int i,j;
//		Clasificable c;
//		for(i=0; i<array.length; i++) {
//			for(j=i+1; j<array.length; j++) {
//				if(array[j].compare(array[i])==Clasificable.INFERIOR) {
//					c=array[j];
//					array[j] = array[i];
//					array[i] = c;
//				}else if(array[j].compare(array[i])==Clasificable.ERROR) {
//					return null;
//				}
//				
//			}
//		}
//		return array;
//	}
	
	public static Persona busquedaPersona(Persona[] tabla, ComparadorPersona cp) {
		for(Persona p:tabla) {
			if(cp.isIdentica(p)) {
				return p;
			}
		}
		return null;
	}
	
	// Al utilizar una interface predefenida de la biblioteca de java
	
	public static Persona busquedaPersonaPrd(Persona[] tabla, Predicate<Persona> pr) {
		for(Persona p: tabla) {
			if(pr.test(p)) {
				return p;
			}
		}
		return null;
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

	public void visualizacion() {
		System.out.println("Nombre es "+ getNombre() + " Apellido es "+getApellido()+" fecha de nacimiento es "+getFecha_nacimiento()+ " con la edad calculada tiene "+calculoEdad()+" años");
	}
	
 // Metodos de busqueda de persona por el nombre, apellido, por edad y fecha de nacimiento
	public static Persona busquedaPorApellido(Persona[] tabla, String apellido) {
		for(Persona p:tabla) {
			if(p.getApellido().equals(apellido)) {
				return p;
			}
		}
		return null;
	}
	public static Persona busquedaPorNombre(Persona[] tabla, String nombre) {
		for(Persona p:tabla) {
			if(p.getNombre().equals(nombre)) {
				return p;
			}
		}
		return null;
	}
	public static Persona busquedaPorEdad(Persona[] tabla, int edad) {
		for(Persona p:tabla) {
			if(p.calculoEdad()==edad) {
				return p;
			}
		}
		return null;
	}
	public static Persona busquedaPorApellidoNombre(Persona[] tabla, String apellido, String nombre) {
		for(Persona p:tabla) {
			if(p.getApellido().equals(apellido) && p.getNombre().equals(nombre)) {
				return p;
			}
		}
		return null;
	}
}

