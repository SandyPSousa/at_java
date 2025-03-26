import java.util.Scanner;

public class GerenciadorAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("\nDigite as notas para calcular a média: \n");


        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        System.out.println("\nDados do aluno:");
        System.out.println("\nMatrícula N°:"+ matricula);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + String.format("%.1f", aluno.calcularMedia()));
        aluno.verificarAprovacao();

        scanner.close();
    }
}

class Aluno {
    private final String nome;
    private final String matricula;
    private final double nota1;
    private final double nota2;
    private final double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            System.out.println("Status: Aprovado ");
        } else {
            System.out.println("Status: Reprovado ");
        }
    }
}
