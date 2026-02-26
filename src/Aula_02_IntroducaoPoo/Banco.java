package Aula_02_IntroducaoPoo;

public class Banco {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        // alterando os valores de minhaConta
        minhaConta.titular = "Otavio";
        minhaConta.saldo = 1000;

        boolean consegui = minhaConta.sacar(2000);

        if  (consegui) {

            System.out.println("Consegui sacar");
        } else {

            System.out.println("Não consegui sacar");
        }
    }
}
