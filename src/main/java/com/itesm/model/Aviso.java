package com.itesm.model;

public class Aviso {
	private int idAviso;
	private String mensajeAviso;
	private String fechaAviso;
	
	public Aviso() {}
	
	public Aviso(int idAviso, String mensajeAviso, String fechaAviso) {
		super();
		this.idAviso = idAviso;
		this.mensajeAviso = mensajeAviso;
		this.fechaAviso = fechaAviso;
	}

	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	public String getMensajeAviso() {
		return mensajeAviso;
	}
	public void setMensajeAviso(String mensajeAviso) {
		this.mensajeAviso = mensajeAviso;
	}
	public String getFechaAviso() {
		return fechaAviso;
	}
	public void setFechaAviso(String fechaAviso) {
		this.fechaAviso = fechaAviso;
	}

	@Override
	public String toString() {
		return "Aviso [idAviso=" + idAviso + ", mensajeAviso=" + mensajeAviso + ", fechaAviso=" + fechaAviso + "]";
	}
	
	
}
