# Sistema de Controle de Aluguel de Quadra Esportiva

## Descrição

Sistema desenvolvido para gerenciar o aluguel de uma quadra esportiva, permitindo o controle de clientes, horários e reservas, evitando conflitos de agendamento e erros no controle manual.

---

Tabelas Identificadas

### Cliente

* id
* nome
* telefone

### Horario

* id
* hora_inicio
* hora_fim
* valor

### Aluguel

* id
* id_cliente
* data
* valor_total

### ItemAluguel

* id
* id_aluguel
* id_horario
* valor

---

## Regras de Negócio

* Não permitir cadastrar cliente com nome vazio
* Não permitir cadastrar horário com valor negativo
* Não permitir reservar um horário já ocupado
* Um aluguel pode conter um ou mais horários
* O valor total do aluguel deve ser calculado automaticamente
* Deve ser possível consultar aluguéis por dia

---

## Estrutura do Projeto

* **sem-mvc/** → implementação simples sem separação de camadas
* **com-mvc/** → implementação utilizando padrão MVC e arquitetura em camadas

---
