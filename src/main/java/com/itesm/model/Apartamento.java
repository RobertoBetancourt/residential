package com.itesm.model;

public class Apartamento extends Propiedad {
	private int numeroEdificio;
	private int numeroPiso;
	private int numeroApartamento;
	
	public Apartamento() {
		super();
	}
	public Apartamento(int numeroEdificio, int numeroPiso, int numeroApartamento) {
		super();
		this.numeroEdificio = numeroEdificio;
		this.numeroPiso = numeroPiso;
		this.numeroApartamento = numeroApartamento;
	}
	public int getNumeroEdificio() {
		return numeroEdificio;
	}
	public void setNumeroEdificio(int numeroEdificio) {
		this.numeroEdificio = numeroEdificio;
	}
	public int getNumeroPiso() {
		return numeroPiso;
	}
	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}
	public int getNumeroApartamento() {
		return numeroApartamento;
	}
	public void setNumeroApartamento(int numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}
	@Override
	public String toString() {
		return "Apartamento [numeroEdificio=" + numeroEdificio + ", numeroPiso=" + numeroPiso + ", numeroApartamento="
				+ numeroApartamento + ", idPropiedad=" + idPropiedad + ", metrosCuadrados=" + metrosCuadrados
				+ ", direccion=" + direccion + ", idUsuario=" + idUsuario + "]";
	}
	
	
}
