package Atividade_03;

public abstract class Conta {
    private double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depositado é efetuado com sucesso!");
        } else {
            System.out.println("Valor invalido");
        }
    }

    public boolean retira(double valor) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public abstract void atualizar(double taxaSelic);
}
