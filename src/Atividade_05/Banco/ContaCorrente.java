package Atividade_05.Banco;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void atualizar(double taxaSelic) {
        super.atualizar(taxaSelic * 2);
        this.retira(15);
    }

    @Override
    public double calcularTributos(double taxa) {
        return (taxa / 10) * this.getSaldo();
    }
}
