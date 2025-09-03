package org.example;

public class Postagem {

    public enum TipoPostagem {
        IMAGEM,
        VIDEO,
        TEXTO
    }

    private String titulo;
    private String descricao;
    int tipoInt;
    TipoPostagem tipo;

    Postagem(String titulo, String descricao, int tipoInt){
        setTitulo(titulo);
        setDescricao(descricao);
        this.tipoInt = tipoInt;
        setTipo(tipoInt);

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoPostagem getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        switch (tipo) {
            case 1:
                this.tipo = TipoPostagem.IMAGEM;
                break;
            case 2:
                this.tipo = TipoPostagem.VIDEO;
                break;
            case 3:
                this.tipo = TipoPostagem.TEXTO;
                break;
        }
    }


}
