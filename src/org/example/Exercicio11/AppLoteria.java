package org.example.Exercicio11;

import java.util.Set;

public class AppLoteria {
    public static void main(String[] args) {
        System.out.println("### Loteria ###");

        System.out.println("\nFaça sua aposta (6 números de 1 a 60):");
        Set<Integer> numerosApostados = Loteria.fazerAposta();

        System.out.println("\nSorteando números...");
        Set<Integer> numerosSorteados = Loteria.sortearNumeros();

        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Sua aposta: " + numerosApostados);

        Loteria.verificarAposta(numerosApostados, numerosSorteados);

        System.out.println("\nFim do programa.");
    }
}
