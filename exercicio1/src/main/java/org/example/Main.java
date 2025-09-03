package org.example;

import java.util.ArrayList;
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

     while (!jogador.estaDerrotado() && !inimigosDerrotado(inimigos)){

         ArrayList<Personagem> alvosVivos = new ArrayList<>();
         for (Personagem inimigo : inimigos){
             if (!inimigo.estaDerrotado()){
                 alvosVivos.add(inimigo);
             }
         }

         Personagem alvo = alvosVivos.get(alet.nextInt(alvosVivos.size()));

         jogador.atacar(alvo);
         System.out.println(jogador.getNome() + " " + jogador.getVida()   + " Ataca seu alvo: " + alvo.getNome() + " " + alvo.getVida());

         for (Personagem inimigo : alvosVivos){
                 inimigo.atacar(jogador);
                 System.out.println(inimigo.getNome() + " " + inimigo.getVida()   + " Ataca seu alvo: " + jogador.getNome() + " " + jogador.getVida());
         }

         System.out.println("------- Termina a batalha --------");

     }

      if (jogador.estaDerrotado()){
          System.out.println(jogador.getNome() + " Perdeu as batalhas");
      } else {
          System.out.println("Os inimigos pederam a batalha");
      }

    }




    static boolean inimigosDerrotado(ArrayList<Personagem> inimigos){
        for (Personagem personagem : inimigos) {
           if (!personagem.estaDerrotado()){
               return false;
           }
        }
        return true;
    }
}