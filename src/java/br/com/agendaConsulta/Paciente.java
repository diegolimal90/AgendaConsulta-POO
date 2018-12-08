/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agendaConsulta;

import java.util.ArrayList;

/**
 *
 * @author dlimalop, rukasugarushia
 */
public class Paciente {
    private String nome;
    private String rg;
    private String cpf;
    private String email;
    private String telefone;
    private String celular;
    private String endereco;

    public Paciente(String nome, String rg, String cpf, String email, String telefone, String celular, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public static ArrayList<Paciente> getPaciente() throws Exception{
        String SQL = "SELECT * FROM PACIENTE";
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Object[]> list = DatabaseConnector.getQuery(SQL, new Object(){});
        for (int i=0; i<list.size(); i++){
            Object row[] = list.get(i);
            Paciente paciente = new Paciente((String) row[0], (String) row[1], (String) row[2], (String) row[3], (String) row[4], (String) row[5], (String) row[6]);
            pacientes.add(paciente);
        }
        return pacientes;
    }
    
    public static void addPaciente(String nome, String rg, String cpf, String email, String telefone, String celular, String endereco) throws Exception{
        String SQL = "INSERT INTO PACIENTE VALUES(?, ?, ?, ?, ?, ?, ?)";
        Object parameters[] = {nome, rg, cpf, email, telefone, celular, endereco};
        DatabaseConnector.execute(SQL, parameters);
    }
    
    public static void removePaciente(String cpf) throws Exception{
        String SQL = "DELETE FROM PACIENTE WHERE CPF = ?";
        Object parameters[] = {cpf};
        DatabaseConnector.execute(SQL, parameters);
    }
}
