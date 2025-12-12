package com.projeto.pagamentos.pagamento;

/**
 * Implementação concreta de Pagamento: Boleto
 */
public class PagamentoBoleto implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + String.format("%.2f", valor) + ". (Vencimento em 3 dias)");
    }
}
