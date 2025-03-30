package org.example.Exercicio10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCompras {
    private final Scanner scanner;
    private final GerenciadorArquivo gerenciadorArquivo;

    public GerenciadorCompras() {
        this.scanner = new Scanner(System.in);
        this.gerenciadorArquivo = new GerenciadorArquivo();
    }

    public void executar() throws IOException {
        gerenciadorArquivo.criarArquivo();

        List<Compra> compras = new ArrayList<>();
        System.out.println("\n==== Registro de Compras ====");
        System.out.println("Por favor, Cadastre 3 compras:");

        for (int i = 0; i < 3; i++) {
            Compra compra = lerCompra(i + 1);
            compras.add(compra);
        }

        gerenciadorArquivo.escreverNoArquivo(compras);
        gerenciadorArquivo.lerArquivo();
    }

    private Compra lerCompra(int numero) {
        System.out.println("\nCompra #" + numero);
        System.out.println("Nome do produto:");
        String produto = scanner.nextLine();

        System.out.println("Quantidade:");
        int quantidade = Integer.parseInt(scanner.nextLine());

        System.out.println("Preço unitário:");
        double preco = Double.parseDouble(scanner.nextLine());

        return new Compra(produto, quantidade, preco);
    }
}
