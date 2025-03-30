package org.example.Exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loteria {

    public static List<Integer> fazerAposta() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numerosApostados = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número entre 1 e 60:");
            int numeroApostado = scanner.nextInt();
            numerosApostados.add(numeroApostado);
        }

        return numerosApostados;
    }

    public static List<Integer> sortearNumeros() {

        List<Integer> numerosSorteados = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int numeroSorteado = (int) (Math.random() * 60) + 1;
            numerosSorteados.add(numeroSorteado);
        }

        return numerosSorteados;
    }

    public static void verificarAposta(List<Integer> numerosApostados, List<Integer> numerosSorteados) {
        int acertos = 0;

        for (int numeroApostado : numerosApostados) {
            if (numerosSorteados.contains(numeroApostado)) {
                acertos++;
            }
        }

        System.out.println("Você acertou " + acertos + " números!");
    }
}
