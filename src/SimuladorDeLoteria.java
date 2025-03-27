import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SimuladorDeLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> numerosSorteados = new HashSet<>();
        Set<Integer> numerosUsuario = new HashSet<>();

        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        System.out.println("Digite 6 números entre 1 e 60:");
        while (numerosUsuario.size() < 6) {
            int num = scanner.nextInt();
            if (num < 1 || num > 60) {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
            } else if (!numerosUsuario.add(num)) {
                System.out.println("Número repetido! Escolha outro número.");
            }
        }

        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosUsuario);

        if (acertos.isEmpty()) {
            System.out.println("Você não acertou nenhum número.");
        } else {
            System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);
        }

        scanner.close();
    }
}
