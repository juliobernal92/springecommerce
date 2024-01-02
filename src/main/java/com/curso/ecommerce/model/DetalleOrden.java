package com.curso.ecommerce.model;

public class DetalleOrden {
	private Integer id_detalleorden;
	private String nombre;
	private double cantidad;
	private int precio;
	private int total;
	
	public DetalleOrden() {
		
	}

	public DetalleOrden(Integer id_detalleorden, String nombre, double cantidad, int precio, int total) {
		super();
		this.id_detalleorden = id_detalleorden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public Integer getId_detalleorden() {
		return id_detalleorden;
	}

	public void setId_detalleorden(Integer id_detalleorden) {
		this.id_detalleorden = id_detalleorden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleOrden [id_detalleorden=" + id_detalleorden + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + "]";
	}
	
	

}
