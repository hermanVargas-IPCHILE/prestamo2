package com.example.prestamo;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellidop;
	private String apellidom;
	private NumeroTelefonico fonoCasa;
	private NumeroTelefonico fonoCelu;
	private NumeroTelefonico fonoOfice;
	
	public Persona(){}
	public Persona(String rut, String nombre, String apellidop,
			String apellidom, NumeroTelefonico fonoCasa,
			NumeroTelefonico fonoCelu, NumeroTelefonico fonoOfice) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.fonoCasa = fonoCasa;
		this.fonoCelu = fonoCelu;
		this.fonoOfice = fonoOfice;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public NumeroTelefonico getFonoCasa() {
		return fonoCasa;
	}

	public void setFonoCasa(NumeroTelefonico fonoCasa) {
		this.fonoCasa = fonoCasa;
	}

	public NumeroTelefonico getFonoCelu() {
		return fonoCelu;
	}

	public void setFonoCelu(NumeroTelefonico fonoCelu) {
		this.fonoCelu = fonoCelu;
	}

	public NumeroTelefonico getFonoOfice() {
		return fonoOfice;
	}

	public void setFonoOfice(NumeroTelefonico fonoOfice) {
		this.fonoOfice = fonoOfice;
	}
	
	

}
