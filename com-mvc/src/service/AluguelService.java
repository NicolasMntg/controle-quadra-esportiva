package service;

import model.*;

public class AluguelService {

    public void registrarHorario(Aluguel aluguel, Horario horario) {

        if (aluguel.getCliente().getNome() == null ||
                aluguel.getCliente().getNome().trim().isEmpty()) {
            throw new RuntimeException("Nome do cliente não pode ser vazio");
        }

        if (horario.getValor() < 0) {
            throw new RuntimeException("Valor do horário não pode ser negativo");
        }

        if (horario.isOcupado()) {
            throw new RuntimeException("Horário já está ocupado");
        }

        ItemAluguel item = new ItemAluguel();
        item.setHorario(horario);
        item.setValor(horario.getValor());

        aluguel.getItens().add(item);

        horario.setOcupado(true);

        calcularTotal(aluguel);
    }

    public void calcularTotal(Aluguel aluguel) {
        double total = 0;

        for (ItemAluguel item : aluguel.getItens()) {
            total += item.getValor();
        }

        aluguel.setValorTotal(total);
    }
}