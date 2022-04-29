package ejercicio3;

public class Edificio {
	//ATRIBUTOS
	private double SuperficieEdificio;

	
	//CONSTRUCTORES
	public Edificio() {
		
	}
	
	public Edificio(double superficieEdificio) {
		super();
		SuperficieEdificio = superficieEdificio;
	}

	//GETTERS Y SETTERS	
	public double getSuperficieEdificio() {
		return SuperficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		SuperficieEdificio = superficieEdificio;
	}


	//METODO TOSTRING	
	public String toString() {
		return "Superficie Edificio = " + SuperficieEdificio;
	}
	
	
	
}
