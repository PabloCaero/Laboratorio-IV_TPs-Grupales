package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;



public class mainEjercicio3 {

	public static void main(String[] args) {
		Polideportivo p1 = new Polideportivo(300.50, 5, "Güemes");
		Polideportivo p2 = new Polideportivo(400.50, 6, "Zabala");
		Polideportivo p3 = new Polideportivo(500.50, 7, "Sarmiento");
		EdificioOficinas p4 = new EdificioOficinas(350.50, 30);
		EdificioOficinas p5= new EdificioOficinas(390.50, 40);
					
		ArrayList<Polideportivo> listaPolideportivo = new ArrayList<Polideportivo>();
		ArrayList<EdificioOficinas> listaEdificioOficinas = new ArrayList<EdificioOficinas>();
	
		listaPolideportivo.add(p1);
		listaPolideportivo.add(p2);
		listaPolideportivo.add(p3);
		listaEdificioOficinas.add(p4);
		listaEdificioOficinas.add(p5);

		System.out.println("--POLIDEPORTIVOS--");				
		ListIterator<Polideportivo> it = listaPolideportivo.listIterator();
		while (it.hasNext()) {
		Polideportivo polideportivo = it.next();
		it.remove();
		System.out.println(polideportivo.toString());
		}
		System.out.println(" ");
		System.out.println("--EDIFICIOS--");		
	    ListIterator<EdificioOficinas> it2 = listaEdificioOficinas.listIterator();
		while (it2.hasNext()) {
		EdificioOficinas edificio = it2.next();
		it2.remove();
		System.out.println(edificio.toString());
		}
			

	}

}
