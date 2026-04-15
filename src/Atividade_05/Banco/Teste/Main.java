package Atividade_05.Banco.Teste;

import Atividade_05.Banco.*;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposito(1000);
        cp.deposito(1000);

        AtualizandoConta adc = new AtualizandoConta(0.01);
        System.out.println("--- Atualizando Contas Individuais ---");
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("\n--- Operações no Banco ---");
        Banco meuBanco = new Banco();

        Conta c1 = new ContaCorrente();
        c1.deposito(1000);

        ContaCorrente cc2 = new ContaCorrente();
        cc2.deposito(2000);

        ContaPoupanca cp2 = new ContaPoupanca();
        cp2.deposito(3000);

        meuBanco.adiciona(c1);
        meuBanco.adiciona(cc2);
        meuBanco.adiciona(cp2);

        AtualizandoConta adc2 = new AtualizandoConta(0.02);

        for (int i = 0; i < meuBanco.pegaTotalDeContas(); i++) {
            System.out.println("Conta posição: " + i);
            adc2.roda(meuBanco.pega(i));
            System.out.println();
        }

        System.out.println("Soma total de todos os saldos no banco: R$ " + adc2.getSaldoTotal());
    }
}
