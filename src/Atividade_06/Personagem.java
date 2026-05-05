package Atividade_06;

public abstract class Personagem {
    private String nome;
    private int nivel;
    private int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        setNivel(nivel);
        setVida(vida);
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) throw new IllegalArgumentException("O nível não pode ser menor que 1!");
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        if (vida < 0) throw new IllegalArgumentException("A vida não pode ser negativa!");
        this.vida = vida;
    }

    public abstract void atacar() throws RecursoInsuficienteException;

    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("Vida: " + this.getNome());
    }
}