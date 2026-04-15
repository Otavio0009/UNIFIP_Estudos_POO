package Atividade_05.Banco.Opicionais;

public class ContaPoupanca implements Conta{
    private double saldo;

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposito(double valor) {
        if(valor > 0){
            this.saldo += valor;
        }
    }

    @Override
    public void retirar(double valor) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.saldo -= valor;
        }
    }

    @Override
    public void atualizar(double taxaSelic) {
        this.saldo = (this.saldo * (1 + taxaSelic)) * 0.75;
    }
}
