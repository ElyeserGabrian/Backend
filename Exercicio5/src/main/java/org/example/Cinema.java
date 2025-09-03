package org.example;

import java.util.ArrayList;

public class Cinema {

    private ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    private ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public ArrayList<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public void venderIngresso(Cliente cliente, String nomeFilme, String assento) throws Exception {
        Filme filmeSelecionado = null;

        for (Filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nomeFilme)) {
                filmeSelecionado = f;
                break;
            }
        }

        if (filmeSelecionado == null) {
            throw new Exception("Filme não encontrado!");
        }

        if (cliente.getIdade() < filmeSelecionado.getIdadeMinima()) {
            throw new Exception("Cliente não possui idade suficiente para assistir este filme!");
        }

        for (Ingresso ingresso : ingressosVendidos) {
            if (ingresso.getAssento().equalsIgnoreCase(assento)) {
                throw new Exception("Assento já está ocupado!");
            }
        }

        Ingresso novoIngresso = new Ingresso(cliente, filmeSelecionado, assento);
        ingressosVendidos.add(novoIngresso);

        System.out.println("Ingresso vendido com sucesso!");
        System.out.println("Cliente: " + cliente.getNome() + " | Filme: " + filmeSelecionado.getNome() +
                " | Assento: " + assento + " | Preço: R$ " + filmeSelecionado.getPreco());
    }
}
