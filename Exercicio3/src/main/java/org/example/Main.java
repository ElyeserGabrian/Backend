package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciando MusicCloud e adicionando músicas disponíveis
        MusicaCloud musicCloud = new MusicaCloud();
        musicCloud.adicionarMusica(new Musica("Bohemian Rhapsody", "Queen"));
        musicCloud.adicionarMusica(new Musica("Smells Like Teen Spirit", "Nirvana"));
        musicCloud.adicionarMusica(new Musica("Billie Jean", "Michael Jackson"));
        musicCloud.adicionarMusica(new Musica("Hotel California", "Eagles"));
        musicCloud.adicionarMusica(new Musica("Shape of You", "Ed Sheeran"));

        // Exibindo músicas disponíveis
        System.out.println("===== Músicas Disponíveis =====");
        musicCloud.musicasDisponiveis();

        // Criando playlist
        System.out.print("\nDigite o nome da sua playlist: ");
        String nomePlaylist = sc.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        // Loop para adicionar músicas
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nDigite o nome da música para adicionar à playlist (ou 'sair' para finalizar): ");
            String nomeMusica = sc.nextLine();

            if (nomeMusica.equalsIgnoreCase("sair")) {
                continuar = false;
            } else {
                try {
                    Musica musicaEncontrada = musicCloud.pesquisarMusica(nomeMusica);
                    playlist.adicionarMusica(musicaEncontrada);
                    System.out.println("Música adicionada: " + musicaEncontrada.getTitulo() + " | " + musicaEncontrada.getArtista());
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }

        // Exibindo a playlist final
        System.out.println("\n====== Playlist Final ======");
        playlist.mostrarPlaylist();

        sc.close();
    }
}
