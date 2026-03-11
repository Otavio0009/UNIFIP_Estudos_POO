package Atividade;
import java.util.ArrayList;
public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Transacao> extrato;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        // E mantemos o ArrayList aqui:
        this.extrato = new ArrayList<Transacao>();
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            this.saldo += valor;
        }
    }

    public void depositar(double valor, Data data) {
        if (valor > 0){
            this.saldo += valor;
            extrato.add(new Transacao("Depósito Realizado", valor, data));
        } else {
            System.out.println("Depósito invalido");
        }
    }

    public void sacar(double valor, Data data) {
        if (valor <= saldo) {
            this.saldo -= valor;
            extrato.add(new Transacao("Saque Realizado", valor, data));
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public void transferir(double valor, Conta destino, Data data) {
        if (valor <= saldo) {
            this.saldo -= valor;
            extrato.add(new Transacao("TRANSFERÊNCIA (SAÍDA)", valor, data));
            destino.receberTransferencia(valor, data);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    private void receberTransferencia(double valor, Data data) {
        this.saldo += valor;
        extrato.add(new Transacao("TRANSFERÊNCIA (ENTRADA)", valor, data));
    }

    public void resumo() {
        System.out.println("\n==============================");
        System.out.println("RESUMO DA CONTA #" + numero);
        System.out.println("CLIENTE: " + titular.getNome() + " (CPF: " + titular.getCpf() + ")");
        System.out.println("SALDO ATUAL: R$ " + saldo);
        System.out.println("---------- EXTRATO ----------");
        for (Transacao t : extrato) {
            System.out.println(t);
        }
        System.out.println("==============================\n");
    }
}
