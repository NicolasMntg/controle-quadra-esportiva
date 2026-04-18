import model.*;
import controller.AluguelController;
import model.Cliente;
import model.Horario;

public class Main2 {
    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente = new Cliente();
        cliente.nome = "João";
        cliente.telefone = "99999-9999";

        // Criando horários
        Horario h1 = new Horario();
        h1.horaInicio = "18:00";
        h1.horaFim = "19:00";
        h1.valor = 100;

        Horario h2 = new Horario();
        h2.horaInicio = "19:00";
        h2.horaFim = "20:00";
        h2.valor = 120;

        // Criando aluguel
        model.Aluguel aluguel = new model.Aluguel();
        aluguel.cliente = cliente;

        // Controller
        AluguelController controller = new AluguelController();

        // Simulando ações
        controller.adicionarHorario(aluguel, h1);
        controller.adicionarHorario(aluguel, h2);

        // Exibindo resultado
        System.out.println("===== RESUMO DO ALUGUEL =====");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Total: R$ " + aluguel.valorTotal);
    }
}