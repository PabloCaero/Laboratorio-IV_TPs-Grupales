package ejercicio3;

public class EdificioOficinas extends Edificio {
	
	//ATRIBUTOS
	public int numeroDeOficinas;

	//CONSTRUCTORES
	public EdificioOficinas() {
		super();
	}
	
	public EdificioOficinas(double superficieEdificio, int numeroDeOficinas) {
		super(superficieEdificio);
		this.numeroDeOficinas = numeroDeOficinas;
	}

	//GETTERS Y SETTERS	
	public int getNumeroDeOficinas() {
		return numeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		this.numeroDeOficinas = numeroDeOficinas;
	}

	
	//METODO TOSTRING
	public String toString() {
		return super.toString() + " - Numero de Oficinas = " + numeroDeOficinas;
	}
	
	
	
}
