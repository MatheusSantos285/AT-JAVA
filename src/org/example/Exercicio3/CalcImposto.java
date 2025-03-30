package org.example.Exercicio3;

import java.util.Scanner;

public class CalcImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu salário mensal:");
        double salario = scanner.nextDouble();

        calcularImposto(salario);

    }

    public static void calcularImposto(double salario) {
        double salarioAnual = salario * 12;
        double salarioLiquido = 0.0;
        double imposto = 0.0;

        if (salarioAnual <= 22847.76 ) {
            salarioLiquido = salarioAnual;
        } else if (salarioAnual >= 22847.77 && salarioAnual <= 33919.80) {
            imposto = (salarioAnual * 7.5) / 100;
            salarioLiquido = salarioAnual - imposto;
        } else if (salarioAnual >= 33919.81 && salarioAnual <= 45012.60) {
            imposto = (salarioAnual * 15) / 100;
            salarioLiquido = salarioAnual - imposto;
        } else {
            imposto = (salarioAnual * 27.5) / 100;
            salarioLiquido = salarioAnual - imposto;
        }

        System.out.println("Imposto devido: R$ " + imposto);
        System.out.println("Salário líquido anual: R$ " + salarioLiquido);
    }
}
