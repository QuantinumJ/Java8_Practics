package aprenderemosAfondo;
// Añadir elemento
// Suprimir un elemento
// Desplazarse sobre el primer elemento
// Desplazarse sobre el ultimo elemento
// Desplazarse sobre el elemento siguiente
// Desplazarse sobre el elemento anterior
// Obtener el numero de elementos


import java.util.ArrayList;



//  Definicion de una clase generica
public class ListaGenrica <T> {
	
	// para almacenar los elementos de la lista
	private ArrayList<T> lista;
	// puntera de posicion en la lista
	private int posicion;
	//numero de elementos de la lista
	private int numeroElementos;
	// constructor con un parametro que permite dimensionar la lista
	
	public ListaGenrica(int tamaño) {
		lista = new ArrayList<T>(tamaño);
	}
	public void añadir(T elemento) {
		lista.add(elemento);
		numeroElementos = numeroElementos+1;
	}
	public void insertar( T elemnto, int indice) {
		// verificamos si el indice no es superior a numero de elementos
		// o si el indice no es inferior a 0
		if(indice >= numeroElementos || indice < 0) {
			return;
		}
		lista.add(indice,elemnto);
		// se actualiza el numero de elementos
		numeroElementos = numeroElementos + 1;
	}
 public void reemplazar(T elemnto, int indice) {
	 
	 // verificamos si el numero de elmentos no es superiror al indice
	 // o si el indice no es inferior al 0
		if(indice >= numeroElementos || indice < 0) {
			return;
		}
		lista.set(indice, elemnto);
	 
 }
 public void suprimir(int indice) {
	 
		if(indice >= numeroElementos || indice < 0) {
			return;
		}
		lista.remove(indice);
		numeroElementos = numeroElementos -1;
 }
 
 public T getElemento(int j) {
	 return lista.get(j);
 }
 public int getNumeroElementos() {
	 return numeroElementos;
 }
 public T primero() throws Exception{
	 if(numeroElementos ==0) {
		 throw new Exception("lista vacia");
	 }
	 // se desplaza el puntero hasta el primer elemento
	 posicion = 0;
	 return lista.get(0);
 }
 public T ultimo() throws Exception{
	 if(numeroElementos ==0) {
		 throw new Exception("lista vacia");
	 }
	 // se desplaza el puntero hasta el primer elemento
	 posicion = numeroElementos -1;
	 return lista.get(posicion);
 }
 public T siguiente() throws Exception{
	 if(numeroElementos ==0) {
		 throw new Exception("lista vacia");
	 }
	 // verificamos si no estamos al final de la lista
	if(posicion == numeroElementos-1) {
		throw new Exception("no hay mas elementos");
	}
	// se desplaza el puntero sobre el elmento siguiente
	posicion = posicion+1;
	return lista.get(posicion);
 }
 public T anterior() throws Exception{
	 if(numeroElementos ==0) {
		 throw new Exception("lista vacia");
	 }
	 //comprabamos si no estamos en el primer elemento
	 if(posicion == 0) {
		 throw new Exception("no hay ningun elemento anterior");
	 }
	 // nos desplazamos a elemento anterior
	 posicion = posicion-1;
	 return lista.get(posicion);
 }
}
