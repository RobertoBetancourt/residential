package com.itesm.model;

public abstract class Propiedad {
	protected int idPropiedad;
	protected int metrosCuadrados;
	protected String direccion;
	protected int idUsuario;
	
	public Propiedad() {
		super();
	}
	public Propiedad(int idPropiedad, int metrosCuadrados, String direccion, int idUsuario) {
		super();
		this.idPropiedad = idPropiedad;
		this.metrosCuadrados = metrosCuadrados;
		this.direccion = direccion;
		this.idUsuario = idUsuario;
	}
	public int getIdPropiedad() {
		return idPropiedad;
	}
	public void setIdPropiedad(int idPropiedad) {
		this.idPropiedad = idPropiedad;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
}
