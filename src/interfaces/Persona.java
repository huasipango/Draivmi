package interfaces;

import java.io.Serializable;

public class Persona implements Serializable{
	private int  cod_per;
	private String nombre_per;
	private String ci_per;
	private String direccion_per;
	private String telefono_per;
	
	public Persona(int cod_per, String nombre_per, String ci_per, String direccion_per, String telefono_per) {
		this.cod_per = cod_per;
		this.nombre_per = nombre_per;
		this.ci_per = ci_per;
		this.direccion_per = direccion_per;
		this.telefono_per = telefono_per;
	}

	public Persona() {
	}

	public int getCod_per() {
		return cod_per;
	}

	public void setCod_per(int cod_per) {
		this.cod_per = cod_per;
	}

	public String getNombre_per() {
		return nombre_per;
	}

	public void setNombre_per(String nombre_per) {
		this.nombre_per = nombre_per;
	}
	
	public String getCi_per() {
		return ci_per;
	}

	public void setCi_per(String ci_per) {
		this.ci_per = ci_per;
	}

	public String getDireccion_per() {
		return direccion_per;
	}

	public void setDireccion_per(String direccion_per) {
		this.direccion_per = direccion_per;
	}

	public String getTelefono_per() {
		return telefono_per;
	}

	public void setTelefono_per(String telefono_per) {
		this.telefono_per = telefono_per;
	}
	
	
	
}
