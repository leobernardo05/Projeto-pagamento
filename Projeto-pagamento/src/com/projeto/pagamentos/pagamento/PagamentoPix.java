package com.projeto.pagamentos.pagamento;

/**
 * Implementação concreta de Pagamento: PIX
 * Demonstra Polimorfismo — sobrescreve pagar().
 */
public class PagamentoPix implements Pagamento {
    private String chavePix; // encapsulamento local à estratégia

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " realizado via PIX (chave: " + chavePix + ").");
    }
}
