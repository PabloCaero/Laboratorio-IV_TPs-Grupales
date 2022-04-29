package ejercicio2;

public class ProductoFresco extends Producto {
	private String fechaDeEnvasado;
	private String paisDeOrigen;
	
	public String getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}
	
	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}
	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}
	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	public ProductoFresco(String fechaDeCaducidad, int nroDeLote, String fechaDeEnvasado, String paisDeOrigen) {
		super(fechaDeCaducidad, nroDeLote);
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}

	@Override
	public String toString() {
		return super.toString()+ ", fechaDeEnvasado=" + fechaDeEnvasado + ", paisDeOrigen=" + paisDeOrigen;
	}
	
	
}
