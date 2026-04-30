package Atividade_06;

public abstract class Personagem {
    private String nome;
    private int nivel;
    private int vida;

    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.setNivel(nivel);
        this.setVida(vida);
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
        if (nivel < 1) throw new IllegalArgumentException("Nível deve ser pelomenos 1!");
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        if (vida < 0) throw new IllegalArgumentException("Não permite vida menor que 0!");
        this.vida = vida;
    }

    public abstract void atacar() throws RecursoInsuficienteException;

    @Override
    public void status() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }
}