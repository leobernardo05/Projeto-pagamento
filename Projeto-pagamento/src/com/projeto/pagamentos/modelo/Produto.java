package com.projeto.pagamentos.modelo;

/**
 * Produto demonstra Abstração (representa apenas nome e preço)
 * e Encapsulamento (atributos private + getters).
 */
public class Produto {
    private String nome;   // encapsulamento
    private double preco;  // encapsulamento

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getters (acesso controlado)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}
