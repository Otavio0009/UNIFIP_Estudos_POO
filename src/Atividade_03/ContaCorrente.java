package Atividade_03;

public class ContaCorrente extends Conta {

    @Override
    public void atualizar(double taxaSelic) {
        this.setSaldo(this.getSaldo() + (1 * taxaSelic * 2));
        this.retira(15);
    }
}
