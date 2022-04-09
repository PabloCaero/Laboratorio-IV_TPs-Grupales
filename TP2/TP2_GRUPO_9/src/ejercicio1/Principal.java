package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor prof = new Profesor();
		prof.setNombre("Daniel");
		prof.setCargo("Profesor");
		
		System.out.println(prof.toString());

	
	
	Profesor p1 = new Profesor();
	p1.setCargo("profesor");
	p1.setAntiguedadDocente(10);
	
	
	Profesor p2 = new Profesor();
	p2.setCargo("profesor");
	p2.setAntiguedadDocente(10);
	
	if(p1.equals(p2))
	{
		System.out.println("Son la misma persona");
	}
	else
	{
		System.out.println("No son la misma persona");
	}

	}
}
