/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendaConsulta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author dlimalop, rukasugarushia
 */
public class Agenda {
    private int id;
    private String dtConsulta;
    private int idMedico;
    private int idPaciente;

    public Agenda() {
    }

    public Agenda(int id, String dtConsulta, int idMedico, int idPaciente) {
        this.id = id;
        this.dtConsulta = dtConsulta;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
    }

    public String getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(String dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    
    
    public static ArrayList<Agenda> getPaciente() throws Exception{
        String SQL = "SELECT * FROM PACIENTE";
        ArrayList<Agenda> agenda = new ArrayList<>();
        ArrayList<Object[]> list = DatabaseConnector.getQuery(SQL, new Object[]{});
        for (int i=0; i<list.size(); i++){
            Object row[] = list.get(i);
            Agenda ag = new Agenda((int) row[0],(String) row[1], (int) row[2], (int) row[3]);
            agenda.add(ag);
        }
        return agenda;
    }
    
    public static void addAgenda(String nome, String rg, String cpf, String email, String telefone, String celular, String endereco) throws Exception{
        String SQL = "INSERT INTO PACIENTE (NOME, RG, CPF, EMAIL, TELEFONE, CELULAR, ENDERECO)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        Object parameters[] = {nome, rg, cpf, email, telefone, celular, endereco};
        DatabaseConnector.execute(SQL, parameters);
    }
    
    public static void removePaciente(int id) throws Exception{
        String SQL = "DELETE FROM PACIENTE WHERE ID = ?";
        Object parameters[] = {id};
        DatabaseConnector.execute(SQL, parameters);
    }
    
    public static void updatePaciente(String email, String telefone, String celular, String endereco, String cpf, int id) throws Exception{
        String SQL = "UPDATE PACIENTE SET EMAIL = ?, TELEFONE = ?, CELULAR = ?, ENDERECO = ? CPF = ? WHERE ID = ?";
        Object parameters[] = {email, telefone, celular, endereco, cpf, id};
        DatabaseConnector.execute(SQL, parameters);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
