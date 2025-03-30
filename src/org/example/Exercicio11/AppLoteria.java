package org.example.Exercicio11;

import java.util.List;

public class AppLoteria {
    public static void main(String[] args) {
        System.out.println("### Loteria ###");

        System.out.println("\nFaça sua aposta (6 números de 1 a 60):");
        List<Integer> numerosApostados = Loteria.fazerAposta();

        System.out.println("\nSorteando números...");
        List<Integer> numerosSorteados = Loteria.sortearNumeros();

        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Sua aposta: " + numerosApostados);

        Loteria.verificarAposta(numerosApostados, numerosSorteados);

        System.out.println("\nFim do programa.");
    }
}
