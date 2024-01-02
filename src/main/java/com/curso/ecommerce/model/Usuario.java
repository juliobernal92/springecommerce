package com.curso.ecommerce.model;

public class Usuario {
	private Integer id_usuario;
	private String nombre;
	private String nombreusuario;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	
	public Usuario() {
		
	}
	
	
	
	public Usuario(Integer id_usuario, String nombre, String nombreusuario, String email, String direccion,
			String telefono, String tipo, String password) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.nombreusuario = nombreusuario;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.password = password;
	}



	public Integer getId_usuario() { return id_usuario;	}
	public void setId_usuario(Integer id_usuario) {	this.id_usuario = id_usuario;}
	
	public String getNombre() {	return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getNombreusuario() {return nombreusuario;}
	public void setNombreusuario(String nombreusuario) {this.nombreusuario = nombreusuario;}
	
	public String getEmail() {return email;	}
	public void setEmail(String email) {this.email = email;	}
	
	public String getDireccion() {return direccion;	}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	
	public String getTelefono() {return telefono;}
	public void setTelefono(String telefono) {this.telefono = telefono;	}
	
	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo = tipo;	}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;	}



	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", nombreusuario=" + nombreusuario
				+ ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo
				+ ", password=" + password + "]";
	}
	
	
	
	
	

}
