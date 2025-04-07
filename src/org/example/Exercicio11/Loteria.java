package org.example.Exercicio11;

import java.util.*;

public class Loteria {

    public static Set<Integer> fazerAposta() {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numerosApostados = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número entre 1 e 60:");
            int numeroApostado = scanner.nextInt();
            numerosApostados.add(numeroApostado);
        }

        return numerosApostados;
    }

    public static Set<Integer> sortearNumeros() {

        Set<Integer> numerosSorteados = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            int numeroSorteado = (int) (Math.random() * 60) + 1;
            numerosSorteados.add(numeroSorteado);
        }

        return numerosSorteados;
    }

    public static void verificarAposta(Set<Integer> numerosApostados, Set<Integer> numerosSorteados) {
        int acertos = 0;

        for (int numeroApostado : numerosApostados) {
            if (numerosSorteados.contains(numeroApostado)) {
                acertos++;
            }
        }

        System.out.println("Você acertou " + acertos + " números!");
    }
}
