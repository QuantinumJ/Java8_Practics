package ejerciciosPropuestos;

import java.time.Duration;
import java.util.ArrayList;

public class Dvd extends Articulo{

	private Duration duracionV;
	// private String productorV;
	//Sustituimos productor del dvd por los datos del la Persona
	private Persona productorV;
	
	// Constructores
	
	public Dvd() {
		super();
	}
	public Dvd(int referencia, String nombre, double precio, Duration duracionV, Persona productorV) {
		super(referencia,nombre,precio);
		setDuracionV(duracionV);
		setProductorV(productorV);
		
		
	}
	
	// get y set
	public Duration getDuracionV() {
		return duracionV;
	}
	public void setDuracionV(Duration duracionV) {
		this.duracionV = duracionV;
	}
	public Persona getProductorV() {
		return productorV;
	}
	public void setProductorV(Persona productorV) {
		this.productorV = productorV;
		ArrayList<Articulo> lista;
		lista = productorV.getObras();
		if(!lista.contains(this)) {
			lista.add(this);
		}
	}
	// Extension del metodo toString
	public String toString() {
		return super.toString()+" "+getDuracionV().toMinutes()+" "+getProductorV();
	}
	
	
}
