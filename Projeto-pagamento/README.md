# Sistema de Pagamentos — Projeto Final Arquitetura de software (Java)

## Visão geral
Aplicação simples de carrinho de compras com múltiplas estratégias de pagamento (PIX, Cartão, Boleto).  
Objetivo: demonstrar os **4 pilares da POO** e aplicar o **Strategy Pattern**.

## Estrutura de pacotes
- `com.projeto.pagamentos.modelo` — classes `Produto`, `Carrinho`
- `com.projeto.pagamentos.pagamento` — interface `Pagamento` e implementações (`PagamentoPix`, `PagamentoCartao`, `PagamentoBoleto`)
- `com.projeto.pagamentos.Main` — ponto de entrada

## Onde cada pilar da POO foi aplicado
- **Abstração**
    - `Produto` e `Carrinho` expõem apenas o comportamento necessário (nome, preço, adicionar/listar/total).
- **Encapsulamento**
    - Atributos `private` em `Produto` e `Carrinho`. Acesso por getters e métodos controlados.
- **Herança**
    - A interface `Pagamento` atua como a superestrutura que as classes concretas “herdam” (implementam).
- **Polimorfismo**
    - `PagamentoPix`, `PagamentoCartao` e `PagamentoBoleto` implementam `pagar()` de maneiras diferentes. O código cliente (`Main`) trata todas como `Pagamento` (mesmo tipo) e invoca `pagar()` sem conhecer a implementação exata.

## Padrão de projetoescolhido
**Strategy Pattern** — usado para encapsular as variações de comportamento de pagamento.  
Justificativa:
- Permite trocar a estratégia de pagamento em tempo de execução.
- Evita condicionais extensos (if/else switch).
- Facilita adicionar novas formas de pagamento no futuro sem alterar a lógica do cliente.

## Como compilar e executar
1. No terminal, posicione-se em `projeto-pagamentos-java/`.
2. Compile:
   ```bash
   javac -d out src/com/projeto/pagamentos/**/*.java
