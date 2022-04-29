package ejercicio2;

public abstract class Producto {
	private String fechaDeCaducidad;
	private int nroDeLote;
	
	public String getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}
	public void setFechaDeCaducidad(String fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	public int getNroDeLote() {
		return nroDeLote;
	}
	public void setNroDeLote(int nroDeLote) {
		this.nroDeLote = nroDeLote;
	}
	
	@Override
	public String toString() {
		return "Producto: fechaDeCaducidad=" + fechaDeCaducidad + ", nroDeLote=" + nroDeLote;
	}
	
	public Producto(String fechaDeCaducidad, int nroDeLote) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.nroDeLote = nroDeLote;
	} 
	
}
