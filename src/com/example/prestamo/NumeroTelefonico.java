package com.example.prestamo;

public class NumeroTelefonico {

	private String codigoArea;
	private int numeroTelefono;
	
	public NumeroTelefonico(String codigoArea, int numeroTelefono) {
		super();
		this.codigoArea = codigoArea;
		this.numeroTelefono = numeroTelefono;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
}
