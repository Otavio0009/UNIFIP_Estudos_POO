package ProjetoBiblioteca;

public class Movimentacao {
    private String tipo;
    private String data;
    private String detalhes;

    public Movimentacao(String tipo, String data, String detalhes) {
        this.tipo = tipo;
        this.data = data;
        this.detalhes = detalhes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return this.getTipo() + " | " + this.getData() + " | " + this.getDetalhes();
    }
}
