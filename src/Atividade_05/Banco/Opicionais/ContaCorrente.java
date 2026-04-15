package Atividade_05.Banco.Opicionais;

import Atividade_05.Banco.*;

public class ContaCorrente implements ContaTributavel {
    private double saldo;

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposito(double valor) {
        if(valor > 0){
            this.saldo += valor;
        }
    }

    @Override
    public void retirar(double valor) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.saldo -= valor;
        }
    }

    @Override
    public void atualizar(double taxaSelic) {
        this.saldo = this.saldo * ((1 + taxaSelic) * 2);
        this.retirar(15);
    }

    @Override
    public double calcularTributos(double taxa) {
        return (taxa / 10) * this.saldo;
    }
}
