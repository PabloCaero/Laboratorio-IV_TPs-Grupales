package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// PUNTO 8
		Empleado[] empleados = new Empleado[5];
		empleados[0] = new Empleado();
		empleados[1] = new Empleado("Paulo", 25);
		empleados[2] = new Empleado("Julieta", 20);
		empleados[3] = new Empleado();
		empleados[4] = new Empleado("Gastón", 35);
		
		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
			System.out.println(Empleado.devuelveProximoID());
		}
		
	}
}