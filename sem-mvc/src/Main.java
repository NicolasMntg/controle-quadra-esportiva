public class Main {
    public static void main(String[] args) {

        // Criando cliente
        Cliente cliente = new Cliente();
        cliente.nome = "Nicolas";
        cliente.telefone = "99999-9999";
        // Validar Cliente
        cliente.validar();

        // Criando horários
        Horario h1 = new Horario();
        h1.horaInicio = "18:00";
        h1.horaFim = "19:00";
        h1.valor = 100;

        Horario h2 = new Horario();
        h2.horaInicio = "19:00";
        h2.horaFim = "20:00";
        h2.valor = 120;

        // Validar Horários
        h1.validar();
        h2.validar();

        // Criando aluguel
        Aluguel aluguel = new Aluguel();
        aluguel.cliente = cliente;

        // Adicionando horários ao aluguel
        ItemAluguel item1 = new ItemAluguel();
        item1.horario = h1;
        item1.valor = h1.valor;

        ItemAluguel item2 = new ItemAluguel();
        item2.horario = h2;
        item2.valor = h2.valor;

        aluguel.adicionarHorario(h1);
        aluguel.adicionarHorario(h2);


        // Exibindo resultado
        System.out.println("----------- RESUMO DO ALUGUEL -----------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Quantidade de horários: " + aluguel.itens.size());
        System.out.println("Total: R$ " + aluguel.valorTotal);
        System.out.println("\n----------- Horários Alugados -----------");
        for (ItemAluguel item : aluguel.itens) {
            System.out.println("Horário: " + item.horario.horaInicio + " - " + item.horario.horaFim);
        }
    }
}