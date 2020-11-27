package com.itesm.model;

public class Casa extends Propiedad {
	private int numeroCasa;

	public Casa() {
		super();
	}

	public Casa(int numeroCasa) {
		super();
		this.numeroCasa = numeroCasa;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	@Override
	public String toString() {
		return "Casa [numeroCasa=" + numeroCasa + "]";
	}

}
