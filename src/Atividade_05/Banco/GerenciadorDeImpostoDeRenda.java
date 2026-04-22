package Atividade_05.Banco;

public class GerenciadorDeImpostoDeRenda {
    private double taxa;
    private double total;

    public GerenciadorDeImpostoDeRenda(double taxa) {
        this.taxa = taxa;
    }

    public double getTotal() {
        return total;
    }

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando Tributavel: " + t);

        this.total += t.calcularTributos(this.taxa);

        System.out.println("Total de tributos acumulado: R$ " + this.total);
    }
}
