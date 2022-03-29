package aprenderemosAfondo;

public class Coche implements Clasificable{
	private String matricula;
	private String marca;
	private String modelo;
	private int potencia;
	
	// Constructor general 
	public Coche() {
	super();
}
	// Constructor con los parametros posibles
	public Coche(String matricula, String marca, String modelo, int potencia) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}
	//get y set
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public int compare(Object o) {
		Coche c;
		if(o instanceof Coche) {
			c=(Coche)o;
		}else {
			return Clasificable.ERROR;
		}
		if(getPotencia()<c.getPotencia()) {
			return Clasificable.INFERIOR;
		}
		if(getPotencia()>c.getPotencia()) {
			return Clasificable.SUPERIOR;
		}
		return Clasificable.IGUAL;
	}
	@Override
	public boolean isInferior(Object o) {
		Coche c;
		if(o instanceof Coche) {
			c=(Coche)o;
		}else {
			return false;
		}
		if(getPotencia()<c.getPotencia()) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean isSuperior(Object o) {
		Coche c;
		if(o instanceof Coche) {
			c=(Coche)o;
		}else {
			return false;
		}
		if(getPotencia()>c.getPotencia()) {
			return true;
		}else {
			return false;
		}
	}
}
