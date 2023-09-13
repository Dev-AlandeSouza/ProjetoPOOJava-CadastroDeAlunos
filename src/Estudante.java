public class Estudante {
    private int matricula;
    private String nome;
    private String email;
    private String telefone;
    private String enderecoCompleto;

    public Estudante(int matricula, String nome, String email, String telefone, String enderecoCompleto) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.enderecoCompleto = enderecoCompleto;
    }

    // Getters para os atributos
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }
}
