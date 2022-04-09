package ejercicio2;

public class ProductoCongelado extends Producto {
	private int temperaturaCongelacionRecomendada;

	public int getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}

	public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	public ProductoCongelado(String fechaDeCaducidad, int nroDeLote, int temperaturaCongelacionRecomendada) {
		super(fechaDeCaducidad, nroDeLote);
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", temperatura congelacion recomendada=" + temperaturaCongelacionRecomendada;
	}
}
