package org.example.Exercicio6;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("ABC654", "Civic", 2020, 0.0);
        veiculo.exibirDetalhes();
        veiculo.registrarViagem(100);
        System.out.println();
        veiculo.exibirDetalhes();

        Veiculo veiculo2 = new Veiculo("DEF321", "Corolla", 2021, 0.0);
        veiculo2.exibirDetalhes();
        veiculo2.registrarViagem(200);
        System.out.println();
        veiculo2.exibirDetalhes();
    }
}
