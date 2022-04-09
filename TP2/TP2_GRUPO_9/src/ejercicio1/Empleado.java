package ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 999; //VARIABLE DE LA CLASE (VARIABLE ESTATICA), LA VARIABLE SE ENCUENTRA INICIALIZADA EN 999 PARA QUE EL PRIMER ID SEA EL NUMERO 1000.
	
	//PUNTO 5
	//CONSTRUCTOR SIN PARAMETROS
	public Empleado() {
		
		cont++;
		
		this.id = cont;
		
		this.nombre = "Sin nombre";
		
		this.edad = 99;
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Empleado(String nombre, int edad) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//PUNTO 6
	
	public static int devuelveProximoID() {
		
		int var = cont+1;
		
		return var;
	}
	
	//PUNTO 7 METODO TOSTRING
	public String toString() {
		
		return "ID: " + id + " " + "NOMBRE: " + nombre +  " " + "EDAD " + edad;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
