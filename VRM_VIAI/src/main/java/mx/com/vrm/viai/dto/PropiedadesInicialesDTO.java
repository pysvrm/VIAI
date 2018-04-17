package mx.com.vrm.viai.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PropiedadesInicialesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String politica = "";
	List<String> politicasHijas = new ArrayList<String>();
	List<String> usuarios = new ArrayList<String>();
	
	

	public List<String> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<String> usuarios) {
		this.usuarios = usuarios;
	}

	public String getPolitica() {
		return politica;
	}

	public void setPolitica(String politica) {
		this.politica = politica;
	}

	public List<String> getPoliticasHijas() {
		return politicasHijas;
	}

	public void setPoliticasHijas(List<String> politicasHijas) {
		this.politicasHijas = politicasHijas;
	}

}
