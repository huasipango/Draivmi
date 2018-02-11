package interfaces;

import java.io.Serializable;
public class Usuario extends Persona implements Serializable{
	private String username_usu;
	private String password_usu;
	private String cargo_usu;
	private double salario_usu;
	Usuario(){
		super();
	}
	public Usuario(int cod_per, String nombre_per, String ci_per, String direccion_per, String telefono_per, String username_usu, String password_usu, String cargo_usu, double salario_usu) {
		super(cod_per, nombre_per, ci_per, direccion_per, telefono_per);
		this.username_usu = username_usu;
		this.password_usu = password_usu;
		this.cargo_usu = cargo_usu;
		this.salario_usu = salario_usu;
	}
	
	public String getUsername_usu() {
		return username_usu;
	}
	public void setUsername_usu(String username_usu) {
		this.username_usu = username_usu;
	}
	public String getPassword_usu() {
		return password_usu;
	}
	public void setPassword_usu(String password_usu) {
		this.password_usu = password_usu;
	}
	public String getCargo_usu() {
		return cargo_usu;
	}
	public void setCargo_usu(String cargo_usu) {
		this.cargo_usu = cargo_usu;
	}
	public double getSalario_usu() {
		return salario_usu;
	}
	public void setSalario_usu(double salario_usu) {
		this.salario_usu = salario_usu;
	}
	
}
