package Atividade_03;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void adiciona(Conta conta) {
        contas.add(conta);
    }

    public Conta pega(int numero) {
        return contas.get(numero);
    }

    public int pegaTotalDeContas() {
        return this.contas.size();
    }

}
