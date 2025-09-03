package org.example;

public class Musica {
    String titulo;
    String artista;

    Musica (String titulo, String artista){
        setTitulo(titulo);
        setArtista(artista);
    }

    String getTitulo(){
        return this.titulo;
    }

    String getArtista(){
        return this.artista;
    }

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setArtista(String artista) {
        this.artista = artista;
    }
}
