package ejercicio1;

import ejercicio1.Persona;

public class Persona implements Comparable<Persona>{
	@Override
	public String toString() {
		return "Apellido: " + apellido + " - Nombre: " + nombre + " - DNI: " + dni;
	}

	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona (String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Persona () {
		this.nombre = "Sin nombre";
		this.apellido = "Sin apellido";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona persona) {
		int numeroRetornado = this.apellido.charAt(0) == persona.apellido.charAt(0)
			? this.nombre.charAt(0) == persona.nombre.charAt(0)
				? 0
				: this.nombre.charAt(0) > persona.nombre.charAt(0)
					? 1
					: -1		
			: this.apellido.charAt(0) > persona.apellido.charAt(0)
					? 1
				    : -1;
		return numeroRetornado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
