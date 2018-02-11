package interfaces;

import java.io.Serializable;
public class Agencia implements Serializable{
	private int  codigo_age;
	private String nombre_age;
	public Agencia(int codigo_age, String nombre_age) {
		this.codigo_age = codigo_age;
		this.nombre_age = nombre_age;
	}
	public Agencia() {
	}
	public int getCodigo_age() {
		return codigo_age;
	}
	public void setCodigo_age(int cod_age) {
		this.codigo_age = cod_age;
	}
	public String getNombre_age() {
		return nombre_age;
	}
	public void setNombre_age(String nombre_age) {
		this.nombre_age = nombre_age;
	}
	
}
