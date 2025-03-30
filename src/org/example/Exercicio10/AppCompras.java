package org.example.Exercicio10;

import java.io.IOException;

public class AppCompras {
    public static void main(String[] args) {
        try {
            GerenciadorCompras gerenciador = new GerenciadorCompras();
            gerenciador.executar();
        } catch (IOException e) {
            System.err.println("Erro ao processar arquivo. " + e.getMessage());
        }
    }
}
