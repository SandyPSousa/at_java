public class CalcularSalario {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Sandy Sousa", 7000);
        Funcionario estagiario = new Estagiario("Sandy Pereira", 2000);

        System.out.println("Funcionários cadastrados:");
        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirSalario() {
        System.out.println(nome + " - Salário final: R$ " + String.format("%.2f", calcularSalario()));
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}
