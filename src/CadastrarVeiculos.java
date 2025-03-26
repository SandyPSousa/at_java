public class CadastrarVeiculos {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("ABC-1234", "Uno", 2025, 30000);
        Veiculo carro2 = new Veiculo("DEF-5678", "Civic", 2025, 40000);

        System.out.println("Detalhes dos veículos:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        carro1.registrarViagem(200);
        carro2.registrarViagem(300);

        System.out.println("Após as viagens:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}

class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println(" ");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Viagem registrada: " + km + " km");
        } else {
            System.out.println("Distância inválida para viagem.");
        }
    }
}
