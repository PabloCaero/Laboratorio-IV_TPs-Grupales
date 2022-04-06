package ejercicio1;

//(PUNTO 2)
public class Empleado {

	//ATRIBUTOS - CONCEPTO DE ENCAPSULACI�N (PUNTO 1)
			private final int id; // EL FINAL EVITA QUE SE MODIFIQUE EL ID MANUALMENTE
			private String nombre;
			private int edad;
		    private static int cont =999;// VARIABLE QUE PERMITE QUE LOS  ID ARRANQUEN  EN 1000
			
		//CONSTRUCTORES
		    
		//(PUNTO 5)
			public Empleado()
			{
			//(PUNTO 4)
		    cont++;//INCREMENTO DE A 1 EN 1  LOS ID AUTOMATICAMENTE
		    this.id= cont; 
		    
			this.nombre ="Sin nombre"; 
			this.edad = 99 ; 			
			}
			
		//(PUNTO 5)
			public Empleado(String nombre,int edad) 
			{
				cont++;
				this.id=   cont;
				this.nombre = nombre;
				this.edad = edad;
				
			}
			
		//GETTERS Y SETTERS
			public int getId() {
				return id;
			}
			
			/*public void setId(int id) {
				this.id = id;
			}*/
			
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

		
	//(PUNTO 6)		
		public static String devuelveProximoID() 
		{
			int aux = cont+1;
			return "El ID del proximo empleado es: " + aux;
		}
		
	//METODO toString()	(PUNTO 7)
		public String toString() {
			return "ID = " + id + ", NOMBRE = " + nombre + ", EDAD = " + edad ;
		}
		
}
