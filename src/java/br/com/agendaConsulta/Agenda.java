/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendaConsulta;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author dlimalop, rukasugarushia
 */
public class Agenda {
    private GregorianCalendar dtConsulta = new GregorianCalendar();
    private Medico medico = new Medico();
    private Paciente paciente = new Paciente();

    public GregorianCalendar getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(GregorianCalendar dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
