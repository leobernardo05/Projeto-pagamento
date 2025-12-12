package com.projeto.pagamentos.pagamento;

/**
 * Interface Pagamento atua como contrato para estratégias de pagamento.
 * Aqui aplicamos Herança (tipos específicos "herdam" o contrato) e Polimorfismo
 * (cada implementação fornece comportamento diferente para pagar()).
 */
public interface Pagamento {
    /**
     * Realiza o pagamento do valor informado.
     * Implementações definem o comportamento concreto.
     */
    void pagar(double valor);
}
