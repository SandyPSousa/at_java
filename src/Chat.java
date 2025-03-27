import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mensagens = new String[10];
        int contador = 0;

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        while (contador < 10) {
            String usuarioAtual = (contador % 2 == 0) ? usuario1 : usuario2;
            System.out.print(usuarioAtual + ", digite sua mensagem: ");
            mensagens[contador] = usuarioAtual + ": " + scanner.nextLine();
            contador++;
        }

        System.out.println("\n##### Histórico de Mensagens ##### ");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! ");

        scanner.close();
    }
}
