import java.util.Scanner;

public class ProgramaCadastroEstudantes {
    public static void main(String[] args) {
        CadastroEstudantes cadastro = new CadastroEstudantes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Estudante");
            System.out.println("2 - Buscar por Matrícula");
            System.out.println("3 - Buscar por Nome");
            System.out.println("4 - Remover Estudante");
            System.out.println("5 - Listar Estudantes");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço Completo: ");
                    String endereco = scanner.nextLine();

                    Estudante novoEstudante = new Estudante(matricula, nome, email, telefone, endereco);
                    cadastro.adicionarEstudante(novoEstudante);
                    break;

                case 2:
                    System.out.print("Digite a matrícula do estudante: ");
                    int matriculaBusca = scanner.nextInt();
                    Estudante estudanteMatricula = cadastro.buscarPorMatricula(matriculaBusca);
                    if (estudanteMatricula != null) {
                        System.out.println("Estudante encontrado:");
                        System.out.println("Matrícula: " + estudanteMatricula.getMatricula());
                        System.out.println("Nome: " + estudanteMatricula.getNome());
                        System.out.println("Email: " + estudanteMatricula.getEmail());
                        System.out.println("Telefone: " + estudanteMatricula.getTelefone());
                        System.out.println("Endereço Completo: " + estudanteMatricula.getEnderecoCompleto());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do estudante: ");
                    String nomeBusca = scanner.nextLine();
                    Estudante estudanteNome = cadastro.buscarPorNome(nomeBusca);
                    if (estudanteNome != null) {
                        System.out.println("Estudante encontrado:");
                        System.out.println("Matrícula: " + estudanteNome.getMatricula());
                        System.out.println("Nome: " + estudanteNome.getNome());
                        System.out.println("Email: " + estudanteNome.getEmail());
                        System.out.println("Telefone: " + estudanteNome.getTelefone());
                        System.out.println("Endereço Completo: " + estudanteNome.getEnderecoCompleto());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a matrícula do estudante a ser removido: ");
                    int matriculaRemover = scanner.nextInt();
                    cadastro.removerEstudante(matriculaRemover);
                    break;

                case 5:
                    cadastro.listarEstudantes();
                    break;

                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}