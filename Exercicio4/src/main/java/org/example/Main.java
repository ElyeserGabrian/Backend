package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Descricao: ");
        String descricao = sc.nextLine();

        System.out.print("Tipo (1 - Imagem, 2 - Video, 3 - Postagem):");
        int tipo = sc.nextInt();

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        MyBook mybook = new MyBook();
        AnyTube anytube = new AnyTube();
        Fotogram fotogram = new Fotogram();


        try {
            switch (postagem.getTipo()) {
                case IMAGEM:
                    mybook.compartilharImagem(postagem);
                    break;
                case VIDEO:
                    mybook.compartilharVideo(postagem);
                    break;
                case TEXTO:
                    mybook.compartilharVideo(postagem);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            switch (postagem.getTipo()) {
                case IMAGEM:
                    anytube.compartilharImagem(postagem);
                    break;
                case VIDEO:
                    anytube.compartilharVideo(postagem);
                    break;
                case TEXTO:
                    anytube.compartilharVideo(postagem);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            switch (postagem.getTipo()) {
                case IMAGEM:
                    fotogram.compartilharImagem(postagem);
                    break;
                case VIDEO:
                    fotogram.compartilharVideo(postagem);
                    break;
                case TEXTO:
                    fotogram.compartilharVideo(postagem);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}