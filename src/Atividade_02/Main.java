package Atividade_02;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        c.deposito(1000);
        cc.deposito(1000);
        cp.deposito(1000);
        c.atualizar(0.01);
        cc.atualizar(0.01);
        cp.atualizar(0.01);

        System.out.println("Saldo: " + c.getSaldo());
        System.out.println("Saldo atual: " + cc.getSaldo());

        System.out.println();

        AtualizandoConta adc = new AtualizandoConta(0.08);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println(adc.getSaldoTotal());

        System.out.println();

        Banco meuBanco = new Banco();

        Conta c1 = new Conta();
        c1.deposito(1000);

        ContaCorrente cc2 = new ContaCorrente();
        cc.deposito(2000);

        ContaPoupanca cp2 = new ContaPoupanca();
        cp.deposito(3000);

        meuBanco.adiciona(c1);
        meuBanco.adiciona(cc2);
        meuBanco.adiciona(cp2);

        System.out.println();

        AtualizandoConta adc2 = new AtualizandoConta(0.02);

        System.out.println("Relatório de Atualização Bancaria");

        System.out.println();

        for (int i = 0; i < meuBanco.pegaTotalDeContas(); i++) {
            System.out.println("Conta pos: " + i);

            System.out.println();

            adc2.roda(meuBanco.pega(i));
        }

        System.out.println();

        System.out.println("Soma total de todos os saldos: R$ " + adc2.getSaldoTotal());
    }
}
