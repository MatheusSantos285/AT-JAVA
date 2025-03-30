package org.example.Exercicio7;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();

        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        aluno.verificarAprovacao();
    }
}
