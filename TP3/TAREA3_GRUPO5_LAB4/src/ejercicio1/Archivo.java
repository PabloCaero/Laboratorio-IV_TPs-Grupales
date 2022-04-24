package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

import ejercicio1.DNI;

public class Archivo {	
	private String ruta;

	public boolean existe()
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public boolean creaArchivo()
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
			
	}
		
	public void lee_letra_x_letra() {

		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			int c = entrada.read(); //Lee el primer caracter
			while (c != -1) 
			{
				char letra = (char) c;
				System.out.println(letra);
				c = entrada.read();
			}
			entrada.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public TreeSet<Persona> leerPersonasDeArchivo() {
		TreeSet<Persona> personas = new TreeSet<Persona>();
		FileReader reader;
		try {
			reader = new FileReader(ruta);
			int readChar = reader.read();
			while (readChar != -1) {
				Persona persona = new Persona();
				String nombre = "";
				while (readChar != 45) {
				   nombre += (char) readChar;
				   readChar = reader.read();
				}
				persona.setNombre(nombre);
				readChar = reader.read();
				String apellido = "";
				while (readChar != 45) {
					apellido += (char) readChar;
					readChar = reader.read();
				}
				persona.setApellido(apellido);
				readChar = reader.read();
				String dni = "";
				while (readChar != 10 && readChar != -1) {
					dni += (char) readChar;					
					readChar = reader.read();
				}
				persona.setDni(dni);
				
				personas.add(persona);
				readChar = reader.read();
			}
			reader.close();
		}  catch (IOException e) {
			e.printStackTrace();
		}
		return personas;
	}
	
	
	
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	/*public void escribir_archivo(String persona) {
		try {
			
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(persona);
			miBuffer.close();
			entrada.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}*/
	
	public void leer_archivo() {
		FileReader entrada;
		
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = "";
			while(linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escribe_lineas(String frase) {
		try 
		{	
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}

