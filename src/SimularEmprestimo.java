import java.util.Scanner;


public class SimularEmprestimo {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite seu nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite o valor do empréstimo:");
                double valorEmprestimo = scanner.nextDouble();

                int parcelas;
                do {
                    System.out.println("Digite a quantidade de parcelas (no mínimo 6 e no máximo 48:");
                    parcelas = scanner.nextInt();
                } while (parcelas < 6 || parcelas > 48);

                double taxaJuros = 0.03;

                double valorTotal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);

                double valorParcela = valorTotal / parcelas;

                System.out.println("\nNome: " + nome);
                System.out.println("Valor do empréstimo: R$ " + valorEmprestimo);
                System.out.println("Número de parcelas: " + parcelas);
                System.out.println("Valor total a pagar: R$ " + valorTotal);
                System.out.println("Valor das parcelas: R$ " + valorParcela);

                scanner.close();
            }
        }