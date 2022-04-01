package aprenderemosAfondo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class testArrayList  {

	public static void main(String[] args) {
		ArrayList<Persona> lista1;
		ArrayList<Persona> lista2;
		// Creacion de las dos instancias
		
		lista1 = new ArrayList<Persona>();
		lista2 = new ArrayList<Persona>();
		// Creacion de las personas para completar la lista
		
		Persona p1,p2,p3,p4,p5;
		p1 = new Persona("Wayne","John",LocalDate.of(1907, 5, 26));
		p2 = new Persona("McQueen","Steve",LocalDate.of(1930, 3, 24));
		p3 = new Persona("Lennon","John",LocalDate.of(1940, 10, 9));
		p4 = new Persona("Gibson","Mel",LocalDate.of(1956, 1, 3));
		p5 = new Persona("Willis","Bruce",LocalDate.of(1955, 3, 19));
		
		// agrerar cuatro personas a la lista
		lista1.add(p1);
		lista1.add(p3);
		lista1.add(p4);
		lista1.add(p5);
		// incluir p1 y p3 en la posicion 1 de la lista
		lista1.add(1,p2);
		// agregar contenido de una lista a otra lista
		lista1.addAll(lista2);
		
		// Mostarar el numero de elementos de la lista
		System.out.println("Hay "+ lista1.size()+ " personas en la lista");
		
		// recorrer la primera lista de principio a fin
		
		Iterator<Persona> it;
		it = lista1.iterator();
		Persona p;
		// mientras haya elementos
		while(it.hasNext()) {
			// recuperar el elemento en curso
			p = it.next();
			System.out.println(p.getApellido());
			// recorrer la lista desde el final y recuperrar un ListIterator posicionado tras el ultimo elemento
		}
			ListIterator<Persona> lit;
			lit = lista1.listIterator(lista1.size());
			// mientras haya elemento
			while(lit.hasPrevious()) {
				p = lit.previous();
				System.out.println(p.getApellido());
			}
		// reemplazar un elemento de la lista
			lista1.set(2, new Persona("Grant","Carry", LocalDate.of(1904, 1, 18)));
			// mostarar eeste lemnto de la lista
			System.out.println(lista1.get(2).getApellido());
			// Buscar un elemento en la lista
			
			int posicion;
			posicion = lista1.indexOf(p4);
			if(posicion ==-1) {
				System.out.println(" No se ha encontrado en la lista");
			}else {
				System.out.println(lista1.get(posicion).getApellido());
			}
			
			//eleminacion selectiva de la lista
			// la expresion lambda determina que elemnos se eliminaran
			lista1.removeIf((Persona pe)->pe.getFecha_nacimiento().getYear()<1940);
			// recorrer la lista para ver el resultado
			it = lista1.iterator();
			// mientras quedan elementos
			while(it.hasNext()) {
				//recuperar elemento en curso
				p = it.next();
				System.out.println(p.getApellido()+" nacido en "+ p.getFecha_nacimiento().getYear() );
			}
			// otra forma de recorrer la lñista la expresion lambda se ejecuta para cada elemento de la lista
			lista1.forEach((Persona per)->System.out.println(per.getApellido()+" edad "+ per.calculoEdad()));
	}

}
