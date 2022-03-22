package com.company;

public class Paciente {

	private String id;
	private String nombre;
	private String edad;
	private String sexo;
	private String peso;
	private String padecimiento;

	public Paciente(String id, String nombre, String edad, String sexo, String peso, String padecimiento) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.padecimiento = padecimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPadecimiento() {
		return padecimiento;
	}

	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
