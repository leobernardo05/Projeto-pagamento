package com.projeto.pagamentos.pagamento;

/**
 * Implementação concreta de Pagamento: Cartão
 */
public class PagamentoCartao implements Pagamento {
    private String numeroCartao;
    private String titular;

    public PagamentoCartao(String numeroCartao, String titular) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    @Override
    public void pagar(double valor) {
        // Em um sistema real aqui teríamos integração com gateway; este é um mock/simulação.
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " realizado com CARTÃO (titular: " + titular + ").");
    }
}
