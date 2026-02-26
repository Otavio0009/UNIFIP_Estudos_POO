package Aula_02_IntroducaoPoo;

public class Conta {
    int numero;
    double saldo;
    String titular;

    Boolean sacar(double valor) {

        if (this.saldo < valor) {

            return false;
        } else {

            this.saldo -= valor;
            return true;
        }
    }

    void deposita(double quantia) {
        this.saldo += quantia;
    }
}
