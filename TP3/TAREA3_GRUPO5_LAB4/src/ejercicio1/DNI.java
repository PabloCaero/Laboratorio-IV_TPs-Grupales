package ejercicio1;

public class DNI {
	
	public static boolean verificarDniInvalido(String dni) throws DniInvalido{       
		
		boolean valido = dni.matches("[+-]?\\d*(\\.\\d+)?");
						
		if(valido == false) {
			DniInvalido val = new DniInvalido();
			throw val;
		}
				
		return valido;
	}
	

}
