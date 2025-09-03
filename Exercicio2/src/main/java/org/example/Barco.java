package org.example;

public class Barco {
    String nome;
    int tamanho;


    Barco(String nome, int tamanho){
        setNome(nome);
        setTamanho(tamanho);
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    String getNome(){
        return this.nome;
    }

    int getTamanho(){
        return this.tamanho;
    }

}
