package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

     Random alet = new Random();

     ArrayList<Personagem> inimigos = new ArrayList<>();

     inimigos.add(new Personagem("Orc",100,10));
     inimigos.add(new Personagem("Goblin",50,5));
     inimigos.add(new Personagem("Lobo",75,15));
     inimigos.add(new Personagem("Cavaleiro",200,20));
     inimigos.add(new Personagem("Dragão",500,50));

     Personagem jogador = new Personagem("Steve",100,20);

     while (!jogador.estaDerrotado()){
         Personagem alvo = inimigos.get(alet.nextInt(5));


         jogador.atacar(alvo);
         System.out.println(jogador.getNome() + " " + jogador.getVida()   + " Ataca seu alvo: " + alvo.getNome() + " " + alvo.getVida());

         alvo.atacar(jogador);
         System.out.println(alvo.getNome() + " " + alvo.getVida() + " Ataca jogador: " +  jogador.getNome() + " " + jogador.getVida());
     }





    }
}