import java.io.*;
import java.util.Scanner;

public class RegistrarCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Cadastro da compra " + i + ":");

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço unitário: \n");
                double preco = Double.parseDouble(scanner.nextLine());

                writer.write(produto + "," + quantidade + "," + preco);
                writer.newLine();
            }
            System.out.println("\nCompras registradas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar compras: " + e.getMessage());
        }

        System.out.println("\nCompras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);
                double total = quantidade * preco;

                System.out.printf("Produto: %s | Quantidade: %d | Preço unitário: R$ %.2f | Total: R$ %.2f\n",
                        produto, quantidade, preco, total);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler compras: " + e.getMessage());
        }

        scanner.close();
    }
}
