package Atividade_04;

public abstract class Personagem {
    private String nome;
    private int quantidadeDeEstaminas;
    private boolean emDefesa;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 3;
        this.quantidadeDeEstaminas = 10;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public boolean isEmDefesa() { return emDefesa; }
    public void setEmDefesa(boolean emDefesa) { this.emDefesa = emDefesa; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public int getQuantidadeDeEstaminas() { return quantidadeDeEstaminas; }
    public void setQuantidadeDeEstaminas(int q) { this.quantidadeDeEstaminas = q; }

    boolean temEstaminas() {
        return quantidadeDeEstaminas > 0;
    }

    void perderVida(int dano) {
        this.vida -= dano;
    }

    void andar() {
        System.out.println(nome + " está andando...");
    }

    abstract void atacar();
    abstract void defesa();

    @Override
    public String toString() {
        return String.format("%s [Vida: %d | Estamina: %d]", nome, vida, quantidadeDeEstaminas);
    }
}