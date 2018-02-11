package interfaces;

import java.io.Serializable;
import java.util.Date;
public class Alquiler implements Serializable{
	private int  codigo_alq;
	private int  codigo_cli;
	private int  codigo_usu;
	private int  codigo_veh;
	private int  codigo_age;
	private Date fecha_inicio_alq;
	private Date fecha_fin_alq;
	private String matricula_veh;
	private float precio_veh;
	public Alquiler(int codigo_alq, int codigo_cli, int codigo_usu, int codigo_veh, int codigo_age,
			Date fecha_inicio_alq, Date fecha_fin_alq,float precio_veh) {
		this.codigo_alq = codigo_alq;
		this.codigo_cli = codigo_cli;
		this.codigo_usu = codigo_usu;
		this.codigo_veh = codigo_veh;
		this.codigo_age = codigo_age;
		this.fecha_inicio_alq = fecha_inicio_alq;
		this.fecha_fin_alq = fecha_fin_alq;
		this.precio_veh = precio_veh;
	}
	public Alquiler(int codigo_alq, Date fecha_inicio_alq, Date fecha_fin_alq, String matricula_veh, float precio_veh) {
		this.codigo_alq = codigo_alq;
		this.fecha_inicio_alq = fecha_inicio_alq;
		this.fecha_fin_alq = fecha_fin_alq;
		this.matricula_veh = matricula_veh;
		this.precio_veh = precio_veh;
	}
	public Alquiler() {
	}
	public int getCodigo_alq() {
		return codigo_alq;
	}
	public void setCodigo_alq(int codigo_alq) {
		this.codigo_alq = codigo_alq;
	}
	public int getCodigo_cli() {
		return codigo_cli;
	}
	public void setCodigo_cli(int codigo_cli) {
		this.codigo_cli = codigo_cli;
	}
	public int getCodigo_usu() {
		return codigo_usu;
	}
	public void setCodigo_usu(int codigo_usu) {
		this.codigo_usu = codigo_usu;
	}
	public int getCodigo_veh() {
		return codigo_veh;
	}
	public void setCodigo_veh(int codigo_veh) {
		this.codigo_veh = codigo_veh;
	}
	public int getCodigo_age() {
		return codigo_age;
	}
	public void setCodigo_age(int codigo_age) {
		this.codigo_age = codigo_age;
	}
	public Date getFecha_inicio_alq() {
		return fecha_inicio_alq;
	}
	public void setFecha_inicio_alq(Date fecha_inicio_alq) {
		this.fecha_inicio_alq = fecha_inicio_alq;
	}
	public Date getFecha_fin_alq() {
		return fecha_fin_alq;
	}
	public void setFecha_fin_alq(Date fecha_fin_alq) {
		this.fecha_fin_alq = fecha_fin_alq;
	}
	public String getMatricula_veh() {
		return matricula_veh;
	}
	public void setMatricula_veh(String matricula_veh) {
		this.matricula_veh = matricula_veh;
	}
	public float getPrecio_veh() {
		return precio_veh;
	}
	public void setPrecio_veh(float precio_veh) {
		this.precio_veh = precio_veh;
	}
	
}
