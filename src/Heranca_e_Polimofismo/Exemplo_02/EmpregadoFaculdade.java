package Heranca_e_Polimofismo.Exemplo_02;

public class EmpregadoFaculdade {
    private String nome;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getGastos() {
        return this.salario;
    }
    public String getInfo() {
        return "nome: " + this.nome + " com salário " + this.salario;
    }
}
