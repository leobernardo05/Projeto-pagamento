package com.projeto.pagamentos.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Carrinho contém uma lista de produtos e operações básicas.
 * Demonstra Abstração (operacionaliza um carrinho de compras).
 */
public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public double total() {
        double soma = 0.0;
        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        return soma;
    }

    public void listar() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
