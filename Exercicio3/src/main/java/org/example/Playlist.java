package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String nome;
    List<Musica> musicas = new ArrayList<>();

    Playlist(String nome) {
        setNome(nome);
        this.musicas = new ArrayList<>();
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    void mostrarPlaylist() {
        System.out.println("Playlist: ");
        for (Musica musica : musicas){
            System.out.println(" - " + musica.getTitulo() + " | " + musica.getArtista());
        }
    }
}