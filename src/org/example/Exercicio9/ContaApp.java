package org.example.Exercicio9;

public class ContaApp {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        System.out.println("Saldo inicial: " + conta.exibirSaldo());

        conta.depositar(500);
        System.out.println("Saldo após depósito: " + conta.exibirSaldo());

        conta.sacar(200);
        System.out.println("Saldo após saque: " + conta.exibirSaldo());

        conta.sacar(2000);
        System.out.println("Saldo após saque: " + conta.exibirSaldo());
    }
}
