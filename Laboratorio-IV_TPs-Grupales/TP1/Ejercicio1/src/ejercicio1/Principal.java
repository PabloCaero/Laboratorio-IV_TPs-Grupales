package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// CODIGO UTILIZADO PARA PROBAR EL PUNTO 4 Y 5
		Empleado x = new Empleado();
		x.setNombre("Jose");
		x.setEdad(30);
		System.out.println(x.toString());
		
		Empleado r = new Empleado();
		r.setNombre("Luara");
		r.setEdad(23);
		System.out.println(r.toString());
		
		Empleado f = new Empleado("Pedro", 20);
		
		System.out.println(f.toString());
	}
}