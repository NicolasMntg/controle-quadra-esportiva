package controller;

import model.Aluguel;
import model.Horario;
import service.AluguelService;

public class AluguelController {

    AluguelService service = new AluguelService();

    public void adicionarHorario(Aluguel aluguel, Horario horario) {
        service.registrarHorario(aluguel, horario);
    }
}