package ejercicio1;
import ejercicio1.Archivo;
import ejercicio1.Persona;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;





public class Principal {

	public static void main(String[] args) {
		
		System.out.println("\n PERSONAS: ");
		
		Archivo archivoPersonas = new Archivo();	
		archivoPersonas.setRuta("Personas.txt");
		
		ArchivoResultado resultado = new ArchivoResultado();
		resultado.setRuta("Resultado.txt"); //PUNTO C - CREA EL ARCHIVO RESULTADO.TXT
		
		String nombre;
		String apellido;
		String dni;
							
		nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
		apellido = JOptionPane.showInputDialog("Ingrese Apellido: ");
		dni = JOptionPane.showInputDialog("Ingrese DNI: ");
		
		TreeSet<Persona> personas = archivoPersonas.leerPersonasDeArchivo();
		
		try {

			DNI.verificarDniInvalido(dni); //PUNTO A
			archivoPersonas.escribe_lineas("\n"+nombre + "-" + apellido + "-" + dni);
			Persona p = new Persona(nombre, apellido, dni);
			personas.add(p);
			
		
		} catch (DniInvalido e) {
			System.out.println("FORMATO DE DNI INCORRECTO");
			e.printStackTrace();
			
		} finally {
			
			System.out.println("\nLISTADO DE PERSONAS ORDENADO \n");			
			for (Persona x : personas) {
				resultado.escribe_lineas("\n"+ x.getApellido() + " - " + x.getNombre() + " - " + x.getDni()); //PUNTO C
				System.out.println(x.toString()); //PUNTO B
			}
		}
				
				
	}

}
