package org.example;

public class MyBook implements PlataformaSocial {
    @Override
    public void compartilharImagem(Postagem postagem){
        System.out.println("Parabéns você acabou de compartilhar uma imagem no MyBook!");
    }

    @Override
    public void compartilharVideo(Postagem postagem){
        System.out.println("Parabéns você acabou de compartilhar um video no MyBook!");
    }

    @Override
    public void compartilharPostagem(Postagem postagem){
        System.out.println("Parabéns você acabou de compartilhar uma postagem no MyBook!");
    }

}
