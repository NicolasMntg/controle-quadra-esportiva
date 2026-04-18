public class Cliente {
    String nome;
    String telefone;

    void validar() {
        if (nome == null || nome.trim().isEmpty()) {
            throw new RuntimeException("Nome do cliente não pode ser vazio");
        }
    }
}