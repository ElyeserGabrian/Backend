package org.example;

public class Personagem {
    String nome;
    int vida;
    int ataque;


    Personagem(String nome, int vida, int ataque){
        setNome(nome);
        setVida(vida);
        setAtaque(ataque);
    }

    String getNome(){

        return this.nome;
    }

    int getVida(){

        return this.vida;
    }

    int getAtaque(){

        return this.ataque;
    }

    void setNome(String nome){

        this.nome = nome;
    }

    void setVida(int vida){

        this.vida = vida;
    }

    void setAtaque(int ataque){

        this.ataque = ataque;
    }

    boolean estaDerrotado(){
        if (getVida() == 0){
            return true;
        }
        return false;
    }

    void receberDano(int dano){
        if (this.vida >= 0 && !estaDerrotado()){
            this.vida -= dano;

        } else {
            System.out.println(this.nome + " foi derrotado!");
        }

    }

    void atacar(Personagem alvo){
        if (alvo.getVida() == 0){
            System.out.println("Olá " + getNome() + " seu ataque falhou!!");
        } else {
            alvo.receberDano(this.ataque);
        }
    }

}
