package Heranca_e_Polimofismo.Exemplo_01;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;


    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Senha autenticada!");
            return true;
        } else {
            System.out.println("Senha invalida!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }
}
