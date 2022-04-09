package ejercicio3;

public class Polideportivo extends InstalacionDeportiva{

	//ATRIBUTOS
	public String nombre;

	//CONSTRUCTORES
	public Polideportivo() {
		super();
	}
	
	public Polideportivo(double superficieEdificio, int tipoDeInstalacion, String nombre) {
		super(superficieEdificio, tipoDeInstalacion);
		this.nombre = nombre;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//METODO TOSTRING
	public String toString() {
		return super.toString() + " - Nombre = " + nombre;
	}
	
	
	
	
	
	
}
