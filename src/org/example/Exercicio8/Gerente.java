package org.example.Exercicio8;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonus = getSalarioBase() * 0.2;
        return getSalarioBase() + bonus;
    }
}
