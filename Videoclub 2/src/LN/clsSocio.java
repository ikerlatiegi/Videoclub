package LN;

import java.io.Serializable;

/**
 * clase clsSocio que implementa la interfaz Serializable
 * @author ikerlatiegi
 *
 */

public class clsSocio implements Serializable
{
	String nombre;
	String apellido;
	int edad;
	String id_socio;
	int antig;
	
	public clsSocio()
	{
		nombre="";
		apellido="";
		edad=0;
		id_socio="";
		antig=0;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getId_socio() {
		return id_socio;
	}

	public void setId(String id_socio) {
		this.id_socio = id_socio;
	}

	public int getAntig() {
		return antig;
	}

	public void setAntig(int antig) {
		this.antig = antig;
	}

	@Override
	public String toString() {
		return "clsSocio [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", id=" + id_socio + ", antig=" + antig + "]";
	}
	
	

}
