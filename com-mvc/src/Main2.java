import model.*;
import controller.AluguelController;
import model.Cliente;
import model.Horario;

public class Main2 {
    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setTelefone("99999-9999");

        // Criando horários
        Horario h1 = new Horario();
        h1.setValor(100);
        h1.setHoraInicio("18:00");
        h1.setHoraFim("19:00");

        Horario h2 = new Horario();
        h2.setHoraInicio("19:00");
        h2.setHoraFim("20:00");
        h2.setValor(200);

        // Criando aluguel
        model.Aluguel aluguel = new model.Aluguel();
        aluguel.setCliente(cliente);

        // Controller
        AluguelController controller = new AluguelController();

        // Simulando ações
        controller.adicionarHorario(aluguel, h1);
        controller.adicionarHorario(aluguel, h2);

        // Exibindo resultado
        System.out.println("===== RESUMO DO ALUGUEL =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Total: R$ " + aluguel.getValorTotal());
    }
}