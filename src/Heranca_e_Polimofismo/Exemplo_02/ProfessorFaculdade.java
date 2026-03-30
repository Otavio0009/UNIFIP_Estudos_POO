package Heranca_e_Polimofismo.Exemplo_02;

public class ProfessorFaculdade extends EmpregadoFaculdade {
    private int horasDeAula;
    public double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aula: "
                + this.horasDeAula;
        return informacao;
    }
}
