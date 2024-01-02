package com.curso.ecommerce.model;

public class Producto {
	private Integer id_producto;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int precio;
	private double cantidad ;
	
	public Producto() {
		
	}

	public Producto(Integer id_producto, String nombre, String descripcion, String imagen, int precio,
			double cantidad) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	
	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", imagen=" + imagen + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
	

}
