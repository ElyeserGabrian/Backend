package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicaCloud {
     private List<Musica> musicasDisponiveis;

     MusicaCloud(){
         this.musicasDisponiveis = new ArrayList<>();
     }

     void adicionarMusica(Musica musica){
         musicasDisponiveis.add(musica);
     }


     Musica pesquisarMusica(String titulo) throws Exception{
         for (Musica musica : musicasDisponiveis){
             if (musica.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                 return musica;
             }
         }
         throw new Exception("Música não encontrado" + titulo);
     }

     void musicasDisponiveis(){
         System.out.println("Musicas Disponiveis: ");
         for (Musica musica : musicasDisponiveis){
             System.out.println(musica.getTitulo() + " " + musica.getArtista());
         }
     }
}
