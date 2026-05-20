# 💳 Sistema de Pagamentos — Projeto Final de Arquitetura de Software (Java)

## 📌 Visão Geral

Este projeto consiste em uma aplicação simples de carrinho de compras desenvolvida em Java, com suporte a múltiplas formas de pagamento.

O sistema foi criado com o objetivo de demonstrar na prática:

- Os 4 pilares da Programação Orientada a Objetos (POO)
- Aplicação do padrão de projeto Strategy Pattern
- Organização em pacotes
- Boas práticas de arquitetura de software

O usuário pode adicionar produtos ao carrinho e escolher diferentes estratégias de pagamento, como:

- PIX
- Cartão de Crédito
- Boleto Bancário

---

# 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Strategy Pattern
- IntelliJ IDEA

---

# 📁 Estrutura do Projeto

```bash
Projeto-pagamento
│
├── out/com/projeto/pagamentos
│   ├── modelo
│   │   ├── Carrinho.class
│   │   └── Produto.class
│   │
│   ├── pagamento
│   │   ├── Pagamento.class
│   │   ├── PagamentoBoleto.class
│   │   ├── PagamentoCartao.class
│   │   └── PagamentoPix.class
│   │
│   └── Main.class
│
├── src/com/projeto/pagamentos
│   ├── modelo
│   │   ├── Carrinho.java
│   │   └── Produto.java
│   │
│   ├── pagamento
│   │   ├── Pagamento.java
│   │   ├── PagamentoBoleto.java
│   │   ├── PagamentoCartao.java
│   │   └── PagamentoPix.java
│   │
│   └── Main.java
│
├── Projeto-pagamento.iml
└── README.md
```

---

# 🚀 Funcionalidades

✅ Cadastro de produtos  
✅ Adição de produtos ao carrinho  
✅ Cálculo do valor total da compra  
✅ Pagamento com PIX  
✅ Pagamento com Cartão  
✅ Pagamento com Boleto  
✅ Separação de responsabilidades em pacotes  
✅ Aplicação de Strategy Pattern  

---

# 🧠 Conceitos de POO Aplicados

## 🔹 Abstração

As classes `Produto` e `Carrinho` representam entidades do mundo real, expondo apenas os comportamentos necessários para o funcionamento do sistema.

Exemplos:

- Nome e preço do produto
- Adicionar itens ao carrinho
- Calcular total da compra

---

## 🔹 Encapsulamento

Os atributos das classes foram definidos como `private`, garantindo maior segurança e controle dos dados.

O acesso é realizado através de:

- Getters
- Métodos específicos

Exemplo:

```java
private String nome;
private double preco;
```

---

## 🔹 Herança

A interface `Pagamento` funciona como uma estrutura base para as diferentes formas de pagamento.

As classes:

- `PagamentoPix`
- `PagamentoCartao`
- `PagamentoBoleto`

implementam os comportamentos definidos na interface.

---

## 🔹 Polimorfismo

O sistema consegue tratar diferentes tipos de pagamento utilizando a mesma referência da interface `Pagamento`.

Exemplo:

```java
Pagamento pagamento = new PagamentoPix();
pagamento.pagar(valor);
```

Assim, o método `pagar()` possui comportamentos diferentes dependendo da implementação utilizada.

---

# 🎯 Padrão de Projeto Utilizado

## Strategy Pattern

O projeto utiliza o padrão de projeto **Strategy Pattern** para encapsular as diferentes estratégias de pagamento.

---

## ✅ Vantagens da utilização

- Permite trocar a forma de pagamento em tempo de execução
- Evita múltiplos `if/else` ou `switch`
- Facilita manutenção do código
- Permite adicionar novas formas de pagamento sem modificar o código principal
- Torna o sistema mais flexível e escalável

---

# 📚 Classes do Projeto

| Classe | Responsabilidade |
|--------|------------------|
| Produto | Representa um produto |
| Carrinho | Gerencia os produtos adicionados |
| Pagamento | Interface de pagamento |
| PagamentoPix | Implementação de pagamento via PIX |
| PagamentoCartao | Implementação de pagamento via cartão |
| PagamentoBoleto | Implementação de pagamento via boleto |
| Main | Classe principal para execução do sistema |

---

# ▶️ Como Executar o Projeto

## 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/projeto-pagamento.git
```

---

## 2️⃣ Abra na IDE

Abra o projeto em uma IDE Java, como:

- IntelliJ IDEA
- Eclipse
- NetBeans

---

## 3️⃣ Execute a classe Main

Arquivo:

```bash
src/com/projeto/pagamentos/Main.java
```

---

# 💻 Exemplo de Saída

```bash
Produtos no carrinho:
- Notebook: R$ 3500.0
- Mouse: R$ 80.0

Total da compra: R$ 3580.0

Pagamento realizado via PIX.
```

---

# 📖 Aprendizados do Projeto

Durante o desenvolvimento deste projeto foram praticados conceitos importantes como:

- Organização de código em pacotes
- Interfaces em Java
- Programação Orientada a Objetos
- Strategy Pattern
- Separação de responsabilidades
- Reutilização de código

---

# 👨‍💻 Autor

Desenvolvido por Leonardo Bernardo.

- Técnico em Informática pelo IFPE
- Bacharelando em Ciência da Computação na UFAPE

---

# 📄 Licença

Este projeto está sob a licença MIT.

Consulte o arquivo LICENSE para mais informações.
