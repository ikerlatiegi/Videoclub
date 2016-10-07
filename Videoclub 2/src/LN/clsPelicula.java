package LN;

import java.io.Serializable;

/**
 * clase clsPelicula que implementa la interfaz Serializable
 * @author ikerlatiegi
 *
 */

public class clsPelicula implements Serializable
{
	String titulo;
	String id_pel;
	int año;
	String genero;
	int duracion;
	String nom_director;
	boolean alquilada;
	
	public clsPelicula()
	{
		titulo="";
		id_pel="";
		año=0;
		duracion=0;
		genero="";
		nom_director="";
		alquilada=false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId_pel() {
		return id_pel;
	}

	public void setId(String id_pel) {
		this.id_pel = id_pel;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getNom_director() {
		return nom_director;
	}

	public void setNom_director(String nom_director) {
		this.nom_director = nom_director;
	}

	public boolean isAlquilada() {
		return alquilada;
	}

	public void setAlquilada(boolean alquilada) {
		this.alquilada = alquilada;
	}

	@Override
	public String toString() {
		return "clsPelicula [titulo=" + titulo + ", id=" + id_pel + ", año=" + año
				+ ", genero=" + genero + ", duracion=" + duracion
				+ ", nom_director=" + nom_director + ", alquilada=" + alquilada
				+ "]";
	}
	
	

	
	
}
