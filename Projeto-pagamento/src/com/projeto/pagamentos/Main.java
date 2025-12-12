package com.projeto.pagamentos;

import com.projeto.pagamentos.modelo.Produto;
import com.projeto.pagamentos.modelo.Carrinho;
import com.projeto.pagamentos.pagamento.Pagamento;
import com.projeto.pagamentos.pagamento.PagamentoPix;
import com.projeto.pagamentos.pagamento.PagamentoCartao;
import com.projeto.pagamentos.pagamento.PagamentoBoleto;

/**
 * Classe Main para demonstrar uso do sistema.
 * Mostra onde o Strategy é aplicado: escolher a estratégia de pagamento em tempo de execução.
 */
public class Main {
    public static void main(String[] args) {
        // Criando produtos (Abstração)
        Produto p1 = new Produto("Café Orgânico", 19.90);
        Produto p2 = new Produto("Chá Verde", 12.50);
        Produto p3 = new Produto("Granola Premium", 24.90);

        // Carrinho
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);

        System.out.println("\nProdutos no carrinho:");
        carrinho.listar();

        double total = carrinho.total();
        System.out.println("\nTotal: R$ " + String.format("%.2f", total) + "\n");

        // Strategy: escolher a forma de pagamento em tempo de execução
        System.out.println("=== PAGAMENTO (usando Strategy) ===");
        // Exemplo 1: PIX
        Pagamento formaPix = new PagamentoPix("meu-usuario@pix");
        formaPix.pagar(total);

        // Exemplo 2: Cartão
        Pagamento formaCartao = new PagamentoCartao("4111111111111111", "Maria Silva");
        formaCartao.pagar(total);

        // Exemplo 3: Boleto
        Pagamento formaBoleto = new PagamentoBoleto();
        formaBoleto.pagar(total);
    }
}
