package Atividade_02;

public class ContaCorrente extends Conta{

    @Override
    public void atualizar(double taxaSelic) {
        super.atualizar(taxaSelic * 2);
        this.retira(15);
    }
}
