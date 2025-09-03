package org.example;

public class Cliente {
    private String nome;
    private int idade;

    Cliente(){}

    Cliente(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
          return this.idade;
    }






}
