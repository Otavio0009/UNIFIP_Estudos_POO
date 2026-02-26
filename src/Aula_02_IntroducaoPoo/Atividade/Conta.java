package Aula_02_IntroducaoPoo.Atividade;

public class Conta {
    String titular;
    int numeroConta;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    public void sacar(double valor) {
        if (valor < saldo){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor ) {
        this.saldo += valor;
    }

    public void calculoDeRendimento() {
        this.saldo *= 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatado();

        return dados;
    }


}
