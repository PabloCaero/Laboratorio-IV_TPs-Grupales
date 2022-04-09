package ejercicio2;

public class ProductoRefrigerado extends Producto {
	private int codigoOrganismo;

	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(int codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	public ProductoRefrigerado(String fechaDeCaducidad, int nroDeLote, int codigoOrganismo) {
		super(fechaDeCaducidad, nroDeLote);
		this.codigoOrganismo = codigoOrganismo;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", codigo de organismo=" + codigoOrganismo;
	}
}
