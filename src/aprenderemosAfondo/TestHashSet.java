package aprenderemosAfondo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Persona> actores;
		HashSet<Persona> cantantes;
		actores = new HashSet<Persona>();
		cantantes = new HashSet<Persona>();
		
		//Creacion de las personas para completar la lista
		
		Persona p1,p2,p3,p4,p5;
		
		p1 = new Persona("Wayne","John",LocalDate.of(1907, 5, 26));
		p2 = new Persona("McQueen","Steve",LocalDate.of(1930, 3, 24));
		p3 = new Persona("Lennon","John",LocalDate.of(1940, 10, 9));
		p4 = new Persona("Gibson","Mel",LocalDate.of(1956, 1, 3));
		p5 = new Persona("Willis","Bruce",LocalDate.of(1955, 3, 19));
		
		actores.add(p1);
		actores.add(p2);
		actores.add(p4);
		actores.add(p5);
		
		cantantes.add(p1);
		cantantes.add(p3);
		
		// comprobacion si los cantantesson, tambien, son actores 
		
		if(actores.containsAll(cantantes)) {
			System.out.println(" todos los cantantes son, tambien, actores");
		}else {
			System.out.println(" algunos cantantes no son actores");
		}
		System.out.println("***********los artistas**********");
		
		
		//Creacion de un Hashset artistas que contenga a cantantes y actores
		
		HashSet<Persona> artistas;
		artistas = new HashSet<Persona>(cantantes);
		artistas.addAll(actores);
		
		// Para recorrer el primer HashSet de artistas vamos a crear un objeto Iterator
		Iterator<Persona> it;
		it = artistas.iterator();
		// Mientras queden elementos en el HashSet de Personas
		Persona p;
		while(it.hasNext()) {
			// recuperar el elemento en curso
			p = it.next();
			System.out.println(p.getApellido());
		}
		System.out.println("*****cantantes y actores*********");
		
		//creacion de un HashSet de personas que son cantantres y actores
		
		HashSet<Persona> acto_canta;
		acto_canta = new HashSet<Persona>(cantantes);
		acto_canta.retainAll(actores);
		it = acto_canta.iterator();
		while(it.hasNext()) {
			p = it.next();
			System.out.println(p.getApellido());
		}
		System.out.println("******Cantantes unicamente********");
		
		HashSet<Persona> unicamenteCantantes;
		unicamenteCantantes = new HashSet<Persona>(cantantes);
		unicamenteCantantes.removeAll(actores);
		for(Persona pe:unicamenteCantantes) {
			System.out.println(pe.getApellido());
		}
		System.out.println("********Actores unicamente********");
		
		HashSet<Persona> unicamenteActores;
		unicamenteActores = new HashSet<Persona>(actores);
		unicamenteActores.removeAll(cantantes);
		for(Persona pe:unicamenteActores) {
			System.out.println(pe.getApellido());
		}
	}

}
