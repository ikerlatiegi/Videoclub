package LN;

import java.io.Serializable;

/**
 * Relaciona un socio con la película que ha alquilado. 
 * Implementa la interfaz Serializable
 * @author ikerlatiegi
 */


public class clsAlquiler implements Serializable{
	
	String codigo;
	String id_socio;
	int nota; //Nota que pone el socio a la película tras haberla alquilado
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getId_socio() {
		return id_socio;
	}
	public void setId_socio(String id_socio) {
		this.id_socio = id_socio;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "clsAlquiler [codigo=" + codigo + ", id_socio=" + id_socio
				+ ", nota=" + nota + "]";
	}
	
	
	
	
	

}
