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
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String crm;
    private String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    //usar esse método para logar com a secretaria
    public static Medico getMedico(String login, String senha) throws Exception{
        String SQL = "select * from Medico where login = ? and senha = ?";
        Object parameters[] = {login, senha.hashcode()};
        ArrayList<Object[]> list = DatabaseConnector.getQuery(SQL, parameters);
        if(list.isEmpty()){
            return null;
        }else{
            Object row[] = list.get(0); //cada row é um atributo da secretaria
            Medico u = new Medico(/*dados secretaria*/); //Criar secretaria para usar no lugar do medico
            return u;
        }
    }
}
