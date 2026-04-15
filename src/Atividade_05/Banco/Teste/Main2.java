package Atividade_05.Banco.Teste;

import Atividade_05.Banco.*;

public class Main2 {
    public static void main(String[] args) {

        Conta[] contas = new Conta[2];
        contas[0] = new ContaCorrente();
        contas[1]  = new ContaPoupanca(); // [1]

        contas[0].deposito(1000.0);
        contas[1].deposito(1000.0);

        double taxaSelicSimples = 0.01;

        System.out.println();

        System.out.println("--- Atualização Simples via Array ---");

        System.out.println();

        for (Conta conta : contas) {
            conta.atualizar(taxaSelicSimples);
            System.out.println("Saldo após atualização: R$ " + conta.getSaldo());
        }

        System.out.println();

        System.out.println("--- Operações no Banco com Atualizador ---");

        System.out.println();

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

        System.out.println();

        AtualizandoConta adc2 = new AtualizandoConta(0.02);

        System.out.println("Relatório de Atualização Bancária:");

        System.out.println();

        for (int i = 0; i < meuBanco.pegaTotalDeContas(); i++) {
            System.out.println("Conta pos: " + (i + 1));
            adc2.roda(meuBanco.pega(i));
            System.out.println();
        }

        System.out.println("Soma total de todos os saldos no banco: R$ " + adc2.getSaldoTotal());
    }
}
