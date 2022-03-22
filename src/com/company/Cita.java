package com.company;

public class Cita {

	private String id;
	private String fechaDeCitas;
	private String doctorId;
	private String pacienteId;


	public Cita(String id, String fechaDeCitas, String doctor, String paciente) {
		this.id = id;
		this.fechaDeCitas = fechaDeCitas;
		this.doctorId = doctor;
		this.pacienteId = paciente;
	}

	public String getFechaDeCitas() {
		return fechaDeCitas;
	}

	public void setFechaDeCitas(String fechaDeCitas) {
		this.fechaDeCitas = fechaDeCitas;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(String pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
