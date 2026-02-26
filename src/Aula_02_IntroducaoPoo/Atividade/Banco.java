package Aula_02_IntroducaoPoo.Atividade;

public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "Otavio";
        c1.saldo = 5000;

        Data data = new Data();
        c1.dataDeAbertura = data;

        data.dia = 8;
        data.mes = 9;
        data.ano = 2006;

        Conta c2 = new Conta();

        /* c2.titular = "Marta";
        c2.saldo = 3000; */

        Conta c3 = new Conta();
        c3 = c1;

        if (c1 == /* c2 */ c3) {
        System.out.println("Contas Iguais");
        } else {
            System.out.println("Contas Diferentes");
        }

        c1.calculoDeRendimento();

        System.out.println(c1.recuperaDadosParaImpressao());
    }
}
