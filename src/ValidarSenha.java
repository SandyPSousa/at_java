import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        String senha;
        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.println("Digite sua senha:");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("A senha precisa ter pelo menos 8 caracteres. Por favor, tente novamente.");
            } else if (!senha.matches(".*[A-Z].*")) {
                System.out.println("A senha precisa ter pelo menos uma letra maiúscula. Por favor, tente novamente.");
            } else if (!senha.matches(".*\\d.*")) {
                System.out.println("A senha precisa ter pelo menos um número. Por favor, tente novamente.");
            } else if (!senha.matches(".*[@#$%^&+=!].*")) {
                System.out.println("A senha precisa ter pelo menos um caractere especial (@, #, $, etc.), or favor, tente novamente.");
            } else {
                senhaValida = true;
                System.out.println("Senha cadastrada com sucesso!");
            }
        }

        scanner.close();
    }
}

