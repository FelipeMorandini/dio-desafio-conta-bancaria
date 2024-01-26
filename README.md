# Desafio DIO - Sistema Bancário com OOP e AOP

Este projeto implementa um sistema bancário simples utilizando a Programação Orientada a Objetos (OOP) e a Programação Orientada a Aspectos (AOP) em Java, com o uso do AspectJ para a implementação de AOP.

## Descrição

O sistema modela contas bancárias com operações básicas como saque e depósito. A hierarquia de classes consiste em uma classe abstrata `Conta`, que é a base para duas subclasses concretas: `ContaPoupanca` e `ContaInvestimento`. Cada uma dessas subclasses pode implementar métodos específicos como o cálculo de tarifas de manutenção.

A funcionalidade de verificação de saldo antes de realizar saques é tratada de forma transversal pelo sistema, sendo implementada através de AOP para garantir que a regra de negócio seja aplicada de maneira consistente em todas as contas, sem duplicação de código.

## Pré-requisitos

- JDK 1.8 ou superior.
- AspectJ 1.9.6 ou superior.

## Configuração do Ambiente

Para compilar e executar este projeto, é necessário ter o JDK e o AspectJ configurados em seu ambiente de desenvolvimento. O projeto pode ser importado e executado em uma IDE que suporte Java e AspectJ, como o Eclipse ou o IntelliJ IDEA com o plugin AspectJ.

## Compilação e Execução

As instruções para compilar e executar o projeto são as seguintes:

1. Compilar o código fonte utilizando o compilador `ajc` do AspectJ.
2. Executar a classe principal que contém o método `main`.

## Contribuição

Para contribuir com este projeto, por favor, siga os procedimentos padrões de fork, branch, commit, pull request e code review.

## Licença

Este projeto é distribuído sob a licença MIT. Veja `LICENSE` para mais informações.

## Contato

Para mais informações, entre em contato através de [inserir método de contato].