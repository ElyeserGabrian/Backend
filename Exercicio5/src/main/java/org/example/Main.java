package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("Vingadores", 30.0, 12));
        cinema.adicionarFilme(new Filme("O Rei Leão", 25.0, 0));
        cinema.adicionarFilme(new Filme("Deadpool", 35.0, 18));
        cinema.adicionarFilme(new Filme("Interestelar", 28.0, 10));
        cinema.adicionarFilme(new Filme("Coringa", 32.0, 16));

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\n Filmes disponíveis:");
                for (Filme f : cinema.getFilmesDisponiveis()) {
                    System.out.println("- " + f.getNome() + " (R$" + f.getPreco() + ", idade mínima: " + f.getIdadeMinima() + ")");
                }

                System.out.print("\nDigite o nome do cliente: ");
                String nomeCliente = sc.nextLine();

                System.out.print("Digite a idade do cliente: ");
                int idadeCliente = sc.nextInt();
                sc.nextLine(); // consumir quebra de linha

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                System.out.print("Digite o nome do filme desejado: ");
                String nomeFilme = sc.nextLine();

                System.out.print("Digite o assento (Ex: A1, B3, C5...): ");
                String assento = sc.nextLine();

                cinema.venderIngresso(cliente, nomeFilme, assento);

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Tente novamente.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("\nDeseja comprar outro ingresso? (s/n): ");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("\nPrograma encerrado. Obrigado!");
        sc.close();
    }
}