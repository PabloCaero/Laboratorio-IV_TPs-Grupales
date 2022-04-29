package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		
		TreeSet<Profesor> listaProfesor = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor("Profesor", 10);
		Profesor p2 = new Profesor("Profesor", 11);
		Profesor p3 = new Profesor("Profesor", 5);
		Profesor p4 = new Profesor("Profesor", 4);
		Profesor p5= new Profesor("Profesor", 9);
		Profesor p6 = new Profesor("Profesor", 1);
		
	
		listaProfesor.add(p1);
		listaProfesor.add(p6);
		listaProfesor.add(p2);
		listaProfesor.add(p3);
		listaProfesor.add(p4);
		listaProfesor.add(p5);
		
		
		
		Iterator<Profesor> it = listaProfesor.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}

		
		
	}
}
