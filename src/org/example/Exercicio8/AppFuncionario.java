package org.example.Exercicio8;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario estagiario = new Estagiario("João", 1000.0);
        System.out.println("Nome do estagiário: " + estagiario.getNome());
        System.out.println("Salário do estagiário: " + estagiario.calcularSalario());

        Funcionario gerente = new Gerente("Maria", 1000.0);
        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
    }
}
