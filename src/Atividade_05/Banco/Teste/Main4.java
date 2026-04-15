package Atividade_05.Banco.Teste;

import Atividade_05.Banco.Opicionais.*;
import Atividade_05.Banco.Tributavel;

public class Main4 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposito(1000);

        Conta c;
        c = cc;
        Tributavel t = cc;
        ContaTributavel ct = cc;
        Object o = cc;

        System.out.println("Saldo via Conta: " + c.getSaldo());
        System.out.println("Tributo via Tributável: " + t.calcularTributos(0.1));
    }
}
