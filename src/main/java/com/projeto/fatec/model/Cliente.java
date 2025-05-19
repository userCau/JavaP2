package com.projeto.fatec.model;

public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String celular;
    private String endereco;

    public Cliente(){
        
    }

    //Sobrecarga dos construtores Cliente
    public Cliente(int id, String nome, String cpf, String celular, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.endereco = endereco;
    }
    public Cliente(String nome, String cpf, String celular, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.endereco = endereco;
    }    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular(){
        return celular;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }





    
}