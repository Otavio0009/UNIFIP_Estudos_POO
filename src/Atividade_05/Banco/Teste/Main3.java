package Atividade_05.Banco.Teste;

import Atividade_05.Banco.*;

public class Main3 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposito(1000);
        cp.deposito(1000);
        SeguroDeVida sv = new SeguroDeVida(5000);

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        double taxaDeImposto = 0.05;

        System.out.println("--- Processando Tributos ---");

        gerenciador.adiciona(cc, taxaDeImposto);
        gerenciador.adiciona(sv, taxaDeImposto);

        System.out.println("--- Resumo Final ---");
        System.out.println("Total de tributos arrecadados: R$ " + gerenciador.getTotal());
        System.out.println("--- Executando lógica original do Banco ---");

        Banco meuBanco = new Banco();
        meuBanco.adiciona(cc);
        meuBanco.adiciona(cp);

        AtualizandoConta adc = new AtualizandoConta(0.01);

        for (int i = 0; i < meuBanco.pegaTotalDeContas(); i++) {
            adc.roda(meuBanco.pega(i));
        }

        System.out.println("Soma total dos saldos: R$ " + adc.getSaldoTotal());
    }
}
