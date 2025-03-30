package org.example.Exercicio4;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();

        System.out.println("Digite a quantidade de parcelas (mínimo 6, máximo 48):");
        int quantidadeParcelas = scanner.nextInt();

        if (quantidadeParcelas < 6 || quantidadeParcelas > 48) {
            System.out.println("Quantidade de parcelas inválida!");
            return;
        }

        double valorParcela = valorEmprestimo / quantidadeParcelas;
        double juros = 0.3;

        double parcelaJuros = valorParcela * juros;

        double valorTotal = valorEmprestimo + (valorEmprestimo * juros);

        System.out.println("Cliente: " + nome);
        System.out.println("Valor total pago pelo empréstimo: R$ " + valorTotal);
        System.out.println("Valor da parcela com juros: R$ " + parcelaJuros);
    }
}
