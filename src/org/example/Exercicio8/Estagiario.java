package org.example.Exercicio8;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double desconto = getSalarioBase() * 0.1;
        return getSalarioBase() - desconto;
    }
}
