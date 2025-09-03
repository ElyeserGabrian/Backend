package org.example;

public class Fotogram implements PlataformaSocial{

    @Override
    public void compartilharPostagem(Postagem postagem){
        System.out.println("Parabéns você acabou de compartilhar uma postagem no Fotogram!");
    }

    @Override
    public void compartilharImagem(Postagem postagem){
        System.out.println("Parabéns você acabou de compartilhar uma imagem no Fotogram!");
    }

    @Override
    public void compartilharVideo(Postagem postagem) throws Exception{
        throw new Exception("Ocorreu um erro! O fotogram não suporta videos!");
    }

}
