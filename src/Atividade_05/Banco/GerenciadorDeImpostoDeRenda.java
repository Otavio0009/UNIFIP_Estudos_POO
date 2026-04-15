package Atividade_05.Banco;

public class GerenciadorDeImpostoDeRenda {
    private double taxa;
    private double total;

    public double getTotal() {
        return total;
    }

    public void adiciona(Tributavel t, double taxa) {
        System.out.println("Adicionando Tributavel: " + t);

        double valorTributo = t.calcularTributos(taxa);

        this.total += valorTributo;

        System.out.println("Total de tributos acumulado: R$ " + this.total);
    }
}
