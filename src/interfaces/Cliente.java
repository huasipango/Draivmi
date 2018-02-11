package interfaces;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
	private String categoria_cli;	
	public Cliente() {
		super();
	}
	public Cliente(int cod_per, String nombre_per, String ci_per, String direccion_per, String telefono_per,String categoria_cli) 
	{
		super(cod_per, nombre_per, ci_per, direccion_per, telefono_per);
		this.categoria_cli = categoria_cli;
	}
	public String getCategoria_cli() {
		return categoria_cli;
	}
	public void setCategoria_cli(String categoria_cli) {
		this.categoria_cli = categoria_cli;
	}
	

}
