package Atividade_02;

public class AtualizandoConta {
    private double saldoTotal = 0;
    private double selic;

    public AtualizandoConta(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public void roda(Conta conta) {
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.atualizar(this.selic);

        System.out.println("Saldo final: " + conta.getSaldo());

        this.saldoTotal += conta.getSaldo();
    }
}
