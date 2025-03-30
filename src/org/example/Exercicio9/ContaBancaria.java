package org.example.Exercicio9;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    public double sacar(double valor) {

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return saldo;
        }

        saldo -= valor;
        return saldo;
    }

    public double exibirSaldo() {
        return saldo;
    }
}
