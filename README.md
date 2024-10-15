# Gerenciamento de Estoque

Este projeto apresenta uma solução simples para o gerenciamento de estoque, permitindo realizar operações como inserir, remover, consultar a quantidade e verificar a existência de produtos no estoque.

## Contexto

Este projeto foi desenvolvido como parte da disciplina **Testes de Software II**. O principal objetivo é aplicar ferramentas automatizadas para geração de testes unitários, como **Randoop**, **EvoSuite** e **ChatGPT**. 
## Funcionalidades

- **Inserir Produto**: Adiciona um novo produto ao estoque.
- **Remover Produto**: Remove um produto existente do estoque.
- **Consultar Quantidade**: Verifica a quantidade disponível de um determinado produto.
- **Checar Produto**: Verifica se um produto está registrado no estoque.

## Ferramentas Utilizadas

- **Randoop**: Gera automaticamente testes unitários a partir de código Java.
- **EvoSuite**: Cria conjuntos de testes com base na cobertura de código, maximizando a cobertura dos testes.
- **ChatGPT**: Auxilia na geração de cenários de testes e no aprimoramento de testes existentes.

## Pré-requisitos

- **Java 8+**
- **Maven** 3.6.0 ou superior

## Execução dos Testes

Para executar os testes automatizados, utilize o comando abaixo:

```bash
mvn test
