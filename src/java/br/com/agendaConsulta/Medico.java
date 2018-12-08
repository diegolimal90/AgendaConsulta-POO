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
public class Medico {
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private String crm;
    private String especialidade;

    public Medico() {
    }
    
    public Medico(int id, String nome, String telefone, String endereco, String crm, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public static ArrayList<Medico> getMedico() throws Exception{
        String SQL = "SELECT * FROM MEDICO";
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Object[]> list = DatabaseConnector.getQuery(SQL, new Object[]{});
        for (int i=0; i < list.size(); i++){
            Object row[] = list.get(i);
            Medico med = new Medico((int) row[0],(String) row[1], (String) row[2], (String) row[3], (String) row[4], (String) row[5]);
            medicos.add(med);
        }
        return medicos;
    }
    
    public static void addMedico(String nome, String telefone, String endereco, String crm, String especialidade) throws Exception{
        String SQL = "INSERT INTO MEDICO (NOME, TELEFONE, ENDERECO, CRM, ESPECIALIDADE) "
                +"VALUES(?, ?, ?, ?, ?)";
        Object parameters[] = {nome, telefone, endereco, crm, especialidade};
        DatabaseConnector.execute(SQL, parameters);
    }
    
    public static void removeMedico(String crm) throws Exception{
        String SQL = "DELETE FROM MEDICO WHERE CRM = ?";
        Object parameters[] = {crm};
        DatabaseConnector.execute(SQL, parameters);
    }
    
    public static void updateMedico(String telefone, String endereco, String crm, int id) throws Exception{
        String SQL = "UPDATE MEDICO SET TELEFONE = ?, ENDERECO = ?, CRM = ? WHERE ID = ?";
        Object parameters[] = {telefone, endereco, crm, id};
        DatabaseConnector.execute(SQL, parameters);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
