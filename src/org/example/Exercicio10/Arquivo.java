package org.example.Exercicio10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
    private static final String NOME_ARQUIVO = "compras.txt";
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        var builder = new StringBuilder();

        System.out.println("\n==== Registro de Compras ====");
        System.out.println("Por favor, Cadastre 3 compras:");
        System.out.println("Nome do produto:");
        String produto1 = scanner.nextLine();
        System.out.println("Quantidade:");
        int quantidade1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Preço unitário:");
        double preco1 = Double.parseDouble(scanner.nextLine());

        var conteudo1 = String.format("Produto: %s, Quantidade: %d, Preço unitário: %.2f\n", produto1, quantidade1, preco1);
        criarArquivo(NOME_ARQUIVO);


        builder.append(conteudo1);

        System.out.println("Nome do produto:");
        String produto2 = scanner.nextLine();
        System.out.println("Quantidade:");
        int quantidade2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Preço unitário:");
        double preco2 = Double.parseDouble(scanner.nextLine());

        var conteudo2 = String.format("Produto: %s, Quantidade: %d, Preço unitário: %.2f\n", produto2, quantidade2, preco2);

        builder.append(conteudo2);

        System.out.println("Nome do produto:");
        String produto3 = scanner.nextLine();
        System.out.println("Quantidade:");
        int quantidade3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Preço unitário:");
        double preco3 = Double.parseDouble(scanner.nextLine());

        var conteudo3 = String.format("Produto: %s, Quantidade: %d, Preço unitário: %.2f\n", produto3, quantidade3, preco3);
        builder.append(conteudo3);

        escreverNoArquivo(NOME_ARQUIVO, builder.toString());

        lerArquivo(NOME_ARQUIVO);
    }

    private static void criarArquivo(String nome) throws IOException {
        Path arquivo = Path.of(nome);
        Files.createFile(arquivo);
        System.out.println("Arquivo criado: " + arquivo.toAbsolutePath());
    }

    private static void escreverNoArquivo(String nome, String conteudo) throws IOException {
        Path arquivo = Path.of(nome);
        Files.writeString(arquivo, conteudo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        System.out.println("Conteúdo escrito no arquivo!");
    }

    private static void lerArquivo(String nome) throws IOException {
        Path arquivo = Path.of(nome);
        if (Files.exists(arquivo)) {
            List<String> linhas = Files.readAllLines(arquivo);
            linhas.forEach(System.out::println);
        } else {
            System.out.println("Arquivo não encontrado: " + arquivo.toAbsolutePath());
        }
    }
}
