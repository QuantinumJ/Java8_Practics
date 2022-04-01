package ejerciciosPropuestos;

public class Articulo  {
	
	private int referencia;
	
 // primera parte del ejercicio
	private String nombre;
	
	private double precio;

	
	// constructores
	public Articulo() {
		super();
	}
	
	
	public Articulo(int referencia) {
		this();
		setReferencia(referencia);
	}
	
	
	public Articulo(int referencia, String nombre) {
		this(referencia);
		setNombre(nombre);
		
	}
	public Articulo(int referencia, String nombre, double precio) {
		this(referencia,nombre);
		setPrecio(precio);
	}
		
	
	
	
	
	//get y set
	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//metodo toString
	public String toString() {
		return getReferencia() +" "+getNombre()+" "+getPrecio(); 
	}

}
