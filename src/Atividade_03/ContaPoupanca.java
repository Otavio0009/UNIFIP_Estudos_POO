package Atividade_03;

public class ContaPoupanca extends Conta {

    @Override
    public void atualizar(double taxaSelic) {
        this.deposito(this.getSaldo() * (1 + taxaSelic * 0.75));
    }
}
