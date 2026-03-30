package Heranca_e_Polimofismo.Exemplo_01;

public class ControleDeBonificacao {
    private double totalBonificacao = 0;

    public void registrar(Funcionario funcionario) {
        this.totalBonificacao += funcionario.getBonificacao();
    }

    public double getTotalBonificacao() {
        return this.totalBonificacao;
    }
}
