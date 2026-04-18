import java.util.ArrayList;

public class Aluguel {

    Cliente cliente;
    ArrayList<ItemAluguel> itens = new ArrayList<>();
    double valorTotal;

    void adicionarHorario(Horario horario) {

        if (horario.ocupado) {
            throw new RuntimeException("Horário já está ocupado");
        }

        ItemAluguel item = new ItemAluguel();
        item.horario = horario;
        item.valor = horario.valor;

        itens.add(item);

        // Registra horario ocupado
        horario.ocupado = true;

        // calcula automaticamente
        calcularTotal();
    }

    void calcularTotal() {
        valorTotal = 0;

        for (ItemAluguel item : itens) {
            valorTotal += item.valor;
        }
    }
}