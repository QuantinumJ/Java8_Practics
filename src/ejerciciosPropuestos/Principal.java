package ejerciciosPropuestos;

import java.time.Duration;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Primera parte del ejercico
		
//		Articulo a1,a2;
//		// Primera forma de usar los metos get y set heredados de la clase padre
//		a1 = new Articulo();
//		a1.setReferencia(100);
//		a1.setNombre("Capuchino");
//		a1.setPrecio(12.5);
//		//Segunda forma de utilizar los constructores correspondientes heredados de la clase padre
//
//		a2 = new Articulo(110,"Cafe",5.80);
//		// mostramos los datos mediante la funcion estatica generada 
//		test(a1);
//		// mostramos los datos mediante la herencia del metodo toString de la clase padre
//		System.out.println("Mediante el metodo heradado toString "+a1.toString());
//		test(a2);
//		System.out.println("Mediante el metodo heradado toString "+a2.toString());
		
		// Segunda parte del ejercio
		Libro l;
		Dvd d;
		l = new Libro();
		l.setReferencia(100);
		l.setNombre("El juego sarcastico");
		l.setPrecio(20.0);
		l.setNumPaginas(550);
		l.setAutor(new Persona("Juan", " Marquez",LocalDate.of(1960,8,7)));
		testLibro(l);
		System.out.println(l.toString());
		d = new Dvd();
		d.setReferencia(110);
		d.setNombre("La escopeta nacional");
		d.setPrecio(25.79);
		d.setDuracionV(Duration.ofMinutes(120));
		d.setProductorV(new Persona("Berlanga"," Luis Garcia",LocalDate.of(1965, 8, 15)));
		testDvd(d);
		System.out.println(d.toString());
		
		
		
		
		
	}
	
	// Primera forma de mostrar datos por pantalla es generar una funcion con el metodo get heredado de la clase padre
	public static void test(Articulo a) {
		System.out.println("referencia: "+ a.getReferencia());
		System.out.println("nombre: "+ a.getNombre());
		System.out.println("precio: "+ a.getPrecio());
	}
	public static void testLibro(Libro l) {
		test(l);
		System.out.println("numero de paginas "+l.getNumPaginas()+ " \nautor "+l.getAutor().toString());
	}
	public static void testDvd(Dvd d) {
		test(d);
		System.out.println("duracion "+d.getDuracionV().toMinutes()+ " minutos");
		System.out.println("productor "+ d.getProductorV().toString());
	}

}
