package interfaces;

import java.io.Serializable;
public class Vehiculo implements Serializable{
	private int  codigo_veh;
	private String matricula_veh;
	private String color_veh;
	private String marca_veh;
	private float precio_veh;
	private boolean estado_veh;
	private int codigo_gar;
	public Vehiculo(int codigo_veh, String matricula_veh, String color_veh, String marca_veh, float precio_veh,
			boolean estado_veh, int codigo_gar) {
		this.codigo_veh = codigo_veh;
		this.matricula_veh = matricula_veh;
		this.color_veh = color_veh;
		this.marca_veh = marca_veh;
		this.precio_veh = precio_veh;
		this.estado_veh = estado_veh;
		this.codigo_gar = codigo_gar;
	}
	
	public Vehiculo(int codigo_veh, String matricula_veh, String color_veh, String marca_veh, float precio_veh,
			boolean estado_veh) {
		super();
		this.codigo_veh = codigo_veh;
		this.matricula_veh = matricula_veh;
		this.color_veh = color_veh;
		this.marca_veh = marca_veh;
		this.precio_veh = precio_veh;
		this.estado_veh = estado_veh;
	}

	public Vehiculo() {
	}
	public int getCodigo_veh() {
		return codigo_veh;
	}
	public void setCodigo_veh(int codigo_veh) {
		this.codigo_veh = codigo_veh;
	}
	public String getMatricula_veh() {
		return matricula_veh;
	}
	public void setMatricula_veh(String matricula_veh) {
		this.matricula_veh = matricula_veh;
	}
	public String getColor_veh() {
		return color_veh;
	}
	public void setColor_veh(String color_veh) {
		this.color_veh = color_veh;
	}
	public String getMarca_veh() {
		return marca_veh;
	}
	public void setMarca_veh(String marca_veh) {
		this.marca_veh = marca_veh;
	}
	public float getPrecio_veh() {
		return precio_veh;
	}
	public void setPrecio_veh(float precio_veh) {
		this.precio_veh = precio_veh;
	}
	public boolean isEstado_veh() {
		return estado_veh;
	}
	public void setEstado_veh(boolean estado_veh) {
		this.estado_veh = estado_veh;
	}
	public int getCodigo_gar() {
		return codigo_gar;
	}
	public void setCodigo_gar(int codigo_gar) {
		this.codigo_gar = codigo_gar;
	}
}
