public class Horario {
    String horaInicio;
    String horaFim;
    double valor;
    boolean ocupado;

    void validar() {
        if (valor < 0) {
            throw new RuntimeException("Valor do horário não pode ser negativo");
        }
    }
}