package service;

import model.*;

public class AluguelService {

    public void registrarHorario(Aluguel aluguel, Horario horario) {

        // validar cliente
        if (aluguel.cliente.nome == null || aluguel.cliente.nome.trim().isEmpty()) {
            throw new RuntimeException("Nome do cliente não pode ser vazio");
        }

        // validar valor
        if (horario.valor < 0) {
            throw new RuntimeException("Valor do horário não pode ser negativo");
        }

        // validar se já está ocupado
        if (horario.ocupado) {
            throw new RuntimeException("Horário já está ocupado");
        }

        // criar item
        ItemAluguel item = new ItemAluguel();
        item.horario = horario;
        item.valor = horario.valor;

        aluguel.itens.add(item);

        // marcar como ocupado
        horario.ocupado = true;

        // calcular total automaticamente
        calcularTotal(aluguel);
    }

    public void calcularTotal(Aluguel aluguel) {
        double total = 0;

        for (ItemAluguel item : aluguel.itens) {
            total += item.valor;
        }

        aluguel.valorTotal = total;
    }
}