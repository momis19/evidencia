package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Consultorio {

    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static List<Cita> citas = new ArrayList<Cita>();
    private static List<Doctor> doctores = new ArrayList<Doctor>();
    private static List<Paciente> pacientes = new ArrayList<Paciente>();
    String opcion = "";
    
    public Consultorio() {}

    public void menu() {
        try {
            do {
                System.out.println("[1] Crear Doctor");
                System.out.println("[2] Crear Paciente");
                System.out.println("[3] Crear Cita");
                System.out.println("[4] Ver Cita");
                System.out.println("[5] Salir");
                System.out.println("Escriba la opción:");
                opcion = entrada.readLine();

                if (opcion.equals("1")) {
                    this.nuevoDoctor();
                } else if (opcion.equals("2")) {
                    this.nuevoPaciente();
                } else if (opcion.equals("3")) {
                    this.nuevaCita();
                } else if (opcion.equals("4")) {
                    this.mostrarCita();
                } else if (opcion.equals("5")) {
                    System.exit(0);
                }

                System.out.println(opcion);

            } while (opcion != null);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void mostrarCita() {
        try {
            String idPaciente;
            System.out.println("id del paciente");

            idPaciente = entrada.readLine();

            Cita cita = citas.stream()
                .filter(c -> idPaciente.equals(c.getPacienteId()))
                .findAny()
                .orElse(null);

            Paciente paciente = pacientes.stream()
                    .filter(p -> cita.getPacienteId().equals(p.getId()))
                    .findAny()
                    .orElse(null);

            Doctor doctor = doctores.stream()
                    .filter(d -> cita.getId().equals(d.getId()))
                    .findAny()
                    .orElse(null);

            String mensaje = "el paciente " + paciente.getNombre() + " tiene cita con el  doctor " + doctor.getNombre() + " la fecha " + cita.getFechaDeCitas() + " por el padecimiento " + paciente.getPadecimiento();
            JOptionPane.showMessageDialog(null, mensaje, "Cita de " + paciente.getNombre(), JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void nuevoDoctor() {
        try {
            String id;
            String nombre;
            String especialidad;
            String horario;
            String costo;

            System.out.println("Id del doctor:");
            id = entrada.readLine();

            System.out.println("Nombre del doctor:");
            nombre = entrada.readLine();

            System.out.println("Especialidad del doctor:");
            especialidad = entrada.readLine();

            System.out.println("Horario del doctor:");
            horario = entrada.readLine();

            System.out.println("Costo del doctor:");
            costo = entrada.readLine();

            Doctor doctor = new Doctor(id, nombre, especialidad, horario, costo);

            doctores.add(doctor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void nuevoPaciente() {
        try {
            String id;
            String nombre;
            String edad;
            String sexo;
            String peso;
            String padecimiento;

            System.out.println("id del paciente:");
            id = entrada.readLine();

            System.out.println("Nombre del paciente:");
            nombre = entrada.readLine();

            System.out.println("Edad del paciente:");
            edad = entrada.readLine();

            System.out.println("Sexo del paciente:");
            sexo = entrada.readLine();

            System.out.println("Peso del paciente:");
            peso = entrada.readLine();

            System.out.println("Padecimiento del paciente:");
            padecimiento = entrada.readLine();

            Paciente paciente = new Paciente(id, nombre, edad, sexo, peso, padecimiento);

            pacientes.add(paciente);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void nuevaCita() {
        try {
            String id;
            String horarioDeCitas;
            String doctorId;
            String pacienteId;

            System.out.println("Id:");
            id = entrada.readLine();

            System.out.println("Fecha de la cita:");
            horarioDeCitas = entrada.readLine();

            System.out.println("Id del doctor:");
            doctorId = entrada.readLine();

            System.out.println("id del paciente:");
            pacienteId = entrada.readLine();

            Cita cita = new Cita(id, horarioDeCitas, doctorId, pacienteId);

            citas.add(cita);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
