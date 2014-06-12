package com.example.prestamo;

import java.util.ArrayList;

public class Prestamo {
	
	private int numero;
	private Persona solicitante;
	private Fecha fechaAutorizacion;
	private Fecha fechaEntrega;
	private ArrayList<Fecha> fechaPago = new ArrayList<Fecha>();
	private int valor;
	private int cuotas;
	
	public Prestamo(){}

	public Prestamo(int numero, Persona solicitante, Fecha fechaAutorizacion,
			Fecha fechaEntrega, ArrayList<Fecha> fechaPago, int valor,
			int cuotas) {
		super();
		this.numero = numero;
		this.solicitante = solicitante;
		this.fechaAutorizacion = fechaAutorizacion;
		this.fechaEntrega = fechaEntrega;
		this.fechaPago = fechaPago;
		this.valor = valor;
		this.cuotas = cuotas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Persona getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Persona solicitante) {
		this.solicitante = solicitante;
	}

	public Fecha getFechaAutorizacion() {
		return fechaAutorizacion;
	}

	public void setFechaAutorizacion(Fecha fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

	public Fecha getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Fecha fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public ArrayList<Fecha> getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(ArrayList<Fecha> fechaPago) {
		this.fechaPago = fechaPago;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	
	
}
