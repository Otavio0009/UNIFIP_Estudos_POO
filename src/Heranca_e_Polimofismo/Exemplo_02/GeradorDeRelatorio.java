package Heranca_e_Polimofismo.Exemplo_02;

public class GeradorDeRelatorio {
    private String nome;
    private double salario;

    private double getGasto() {
        return this.salario;
    }

    private String getInfo() {
        return "nome" + this.nome + " com salário " + this.salario;
    }
}
