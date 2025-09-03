package org.example;

public class AnyTube implements PlataformaSocial{
    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Parabéns você acabou de compartilhar uma postagem no AnyTube!");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Parabéns você acabou de compartilhar uma video no AnyTube!");
    }

    @Override
    public void compartilharImagem(Postagem postagem) throws Exception {
        throw new Exception("Ocorreu um erro! Não é possivel compartilhar imagem no AnyTube!");
    }
}
