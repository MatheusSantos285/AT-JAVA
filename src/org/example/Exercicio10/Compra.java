package org.example.Exercicio10;

public class Compra {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Compra(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s\nQuantidade: %d\nPreço unitário: R$ %.2f\nTotal: R$ %.2f", produto, quantidade, precoUnitario, getTotal());
    }
}
