package Atividade_06;

public abstract class Personagem {
    private String noma;
    private int nivel;
    private int vida;

    public Personagem(String noma, int nivel, int vida) {
        this.noma = noma;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNoma() {
        return noma;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) throw new IllegalArgumentException("Não é permitido nível menor que 1!");
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        if (vida < 0) throw new IllegalArgumentException("Vida não pode ser negativa!");
        this.vida = vida;
    }

    public abstract void atacar() throws RecursoInsuficienteException;

    public void exibirStatus() {
        System.out.println("Nome: " + this.getNoma());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("Vida: " + this.getVida());
    }
}