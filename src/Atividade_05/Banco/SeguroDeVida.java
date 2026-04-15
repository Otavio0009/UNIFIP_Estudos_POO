package Atividade_05.Banco;

public class SeguroDeVida implements Tributavel {
    private double saldo;

    public SeguroDeVida(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public double calcularTributos(double taxa) {
        return taxa * this.saldo + 10;
    }
}
