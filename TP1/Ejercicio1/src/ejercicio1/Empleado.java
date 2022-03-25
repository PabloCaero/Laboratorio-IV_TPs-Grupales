package ejercicio1;

public class Empleado {

	//ATRIBUTOS - CONCEPTO DE ENCAPSULACIÓN
		private  int id;
		private String nombre;
		private int edad;
	
	    private  static int cont =999;// INCREMENTA DE A 1 EN 1  LOS ID /PARA GENERAR EL ID AUTOMATICAMENTE
		
	//CONSTRUCTORES
		public Empleado()
		{
	    cont++;
		this.id= cont;
		this.nombre ="Sin nombre";
		this.edad = 0 ;
		
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
		
		
	//METODO toString()	
		public String toString() {
			return "ID = " + id + ", NOMBRE = " + nombre + ", EDAD = " + edad ;
		}
		
}
