package ejercicio3;

public class InstalacionDeportiva extends Edificio {
	
	//ATRIBUTOS
	private int TipoDeInstalacion;

	//CONSTRUCTORES
	public InstalacionDeportiva() {
		super();
	}
	
	public InstalacionDeportiva(double superficieEdificio, int tipoDeInstalacion) {
		super(superficieEdificio);
		TipoDeInstalacion = tipoDeInstalacion;
	}

	//GETTERS Y SETTERS
	public int getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		TipoDeInstalacion = tipoDeInstalacion;
	}

	//METODO TOSTRING
	public String toString() {
		return super.toString() + " - Tipo de Instalacion = " + TipoDeInstalacion;
	}
		
}
