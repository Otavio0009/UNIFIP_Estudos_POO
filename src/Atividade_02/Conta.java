package Atividade_02;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depositado é efetuado com sucesso!");
        } else {
            System.out.println("Valor invalido");
        }
    }

    public boolean retira(double valor) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public void atualizar(double taxaSelic) {
        this.setSaldo(this.getSaldo() * (1 + taxaSelic));
    }
}
