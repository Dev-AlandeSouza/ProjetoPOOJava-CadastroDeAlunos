import java.util.ArrayList;
import java.util.List;

public class CadastroEstudantes {
    private List<Estudante> estudantes = new ArrayList<>();

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public Estudante buscarPorMatricula(int matricula) {
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula() == matricula) {
                return estudante;
            }
        }
        return null;
    }

    public Estudante buscarPorNome(String nome) {
        for (Estudante estudante : estudantes) {
            if (estudante.getNome().equalsIgnoreCase(nome)) {
                return estudante;
            }
        }
        return null;
    }

    public void removerEstudante(int matricula) {
        Estudante estudante = buscarPorMatricula(matricula);
        if (estudante != null) {
            estudantes.remove(estudante);
        } else {
            System.out.println("Estudante não encontrado.");
        }
    }

    public void listarEstudantes() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
        } else {
            System.out.println("Lista de Estudantes:");
            for (Estudante estudante : estudantes) {
                System.out.println("Matrícula: " + estudante.getMatricula());
                System.out.println("Nome: " + estudante.getNome());
                System.out.println("Email: " + estudante.getEmail());
                System.out.println("Telefone: " + estudante.getTelefone());
                System.out.println("Endereço Completo: " + estudante.getEnderecoCompleto());
                System.out.println("-----------------------------");
            }
        }
    }
}
