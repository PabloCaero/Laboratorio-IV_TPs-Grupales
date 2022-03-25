package ejercicio1;

public class Empleado {

	//ATRIBUTOS - CONCEPTO DE ENCAPSULACIÓN
		private int id; // EL FINAL EVITA QUE SE MODIFIQUE EL ID MANUALMENTE
		private String nombre;
		private int edad;
	    private  static int cont =999;// INCREMENTA DE A 1 EN 1  LOS ID PARA GENERAR EL ID AUTOMATICAMENTE
		
	//CONSTRUCTORES
		public Empleado()
		{
	    cont++;
		this.id= cont;
		this.nombre ="Sin nombre";
		this.edad = 99 ;
		
		}
		
		public Empleado(String nombre,int edad) 
		{
			cont++;
			this.id=   cont;
			this.nombre =nombre;
			this.edad = edad;
			
		}
		
	//GETTERS Y SETTERS
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		
	// Punto 6
		
		public static String devuelveProximoID() 
		{
			int aux = cont+1;
			return "El proximo empleado: " + aux;
		}
		
	//METODO toString()	
		public String toString() {
			return "ID = " + id + ", NOMBRE = " + nombre + ", EDAD = " + edad ;
		}
		
}
