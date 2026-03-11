package Atividade;

public class Transacao {
    private String tipo;
    private double valor;
    private Data data;

    public Transacao(String tipo, double valor, Data data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " - " + tipo + ": R$ " + valor;
    }
}
