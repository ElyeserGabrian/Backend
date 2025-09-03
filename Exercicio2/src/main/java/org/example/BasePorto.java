package org.example;

import java.util.ArrayList;

public class BasePorto {
        String nome;

        ArrayList<Barco> barcosAtracados = new ArrayList();

        BasePorto(String nome){
            setNome(nome);
        }

    public BasePorto() {
    }

    void setNome(String nome){
            this.nome = nome;
        }

        String getNome(){
            return nome;
        }


        void atracarBarco(Barco barco){
            barcosAtracados.add(barco);
        }

        void desatacarBarco(Barco barco){
            barcosAtracados.remove(barco);
        }

        void barcosAtracado(){
            for (Barco barco : barcosAtracados) {
                System.out.println(barco);
            }
        }
}






