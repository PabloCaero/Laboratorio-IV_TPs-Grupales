package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
			
		Profesor p1 = new Profesor("Profesor", 10);
		Profesor p2 = new Profesor("Profesor", 11);
		Profesor p3 = new Profesor("Profesor", 5);
		Profesor p4 = new Profesor("Profesor", 4);
		Profesor p5= new Profesor("Profesor", 9);
		Profesor p6 = new Profesor("Profesor", 1);
		
			
			ArrayList<Profesor> listaProfesor = new ArrayList<Profesor>();
			
			listaProfesor.add(p1);
			listaProfesor.add(p5);
			listaProfesor.add(p2);
			listaProfesor.add(p3);
			listaProfesor.add(p4);
			listaProfesor.add(p6);
			
			
			ListIterator<Profesor> it = listaProfesor.listIterator();
			while (it.hasNext()) {
				Profesor profesor = it.next();
				it.remove();
				System.out.println(profesor.toString());
			}
			
	}
}
