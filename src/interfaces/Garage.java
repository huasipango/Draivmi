package interfaces;

import java.io.Serializable;

public class Garage implements Serializable{
	private int  codigo_gar;
	private String nombre_gar;
	private int  capacidad_gar;
	public Garage(int codigo_gar, String nombre_gar, int capacidad_gar) {
		this.codigo_gar = codigo_gar;
		this.nombre_gar = nombre_gar;
		this.capacidad_gar = capacidad_gar;
	}
	public Garage() {
	}
	public int getCodigo_gar() {
		return codigo_gar;
	}
	public void setCodigo_gar(int codigo_gar) {
		this.codigo_gar = codigo_gar;
	}
	public String getNombre_gar() {
		return nombre_gar;
	}
	public void setNombre_gar(String nombre_gar) {
		this.nombre_gar = nombre_gar;
	}
	public int getCapacidad_gar() {
		return capacidad_gar;
	}
	public void setCapacidad_gar(int capacidad_gar) {
		this.capacidad_gar = capacidad_gar;
	}
	
	
}
