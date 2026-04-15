package Atividade_05.Banco;

public class ContaPoupanca extends Conta {

    @Override
    public void atualizar(double taxaSelic) {

        super.atualizar(taxaSelic * 0.75);
    }
}
