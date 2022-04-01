package ejerciciosPropuestos;

import java.util.ArrayList;

public class Libro extends Articulo{
	private String isbn;
	
	private int numPaginas;
	//Modificamos los datos del nombre del autor por una herencia de la clase persona
	private Persona autor;
	//private String autor;
	// Constructor con extender de la clase padre constructor 
	public Libro() {
		super();
	}
	public Libro(int referencia, String nombre, double precio, String isbn, int numPaginas, Persona autor) {
		// Para acceder al constructor de la clase padre
		super(referencia,nombre,precio);
		setIsbn(isbn);
		setNumPaginas(numPaginas);
		setAutor(autor);
		
	}
	// metodos get y set
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public Persona getAutor() {
		return autor;
	}
	public void setAutor(Persona autor) {
		this.autor = autor;
		ArrayList<Articulo> lista;
		lista = autor.getObras();
		if(!lista.contains(this)) {
			lista.add(this);
		}
	}
	// Extendendemos el metodo toString de la clase padre. Para apuntar al metodo que nos interesa de la clase padre utilizamos la palabra reservada super
	// 	punto y el nombre del metodo
	public String toString() {
		return super.toString()+ " "+getNumPaginas()+ " "+getAutor();
	}

	
}
