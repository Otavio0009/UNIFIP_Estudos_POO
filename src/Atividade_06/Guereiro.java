package Atividade_06;

public class Guereiro extends Personagem implements HabilidadesEspeciais{
    private int forca;

    public Guereiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        setForca(forca);
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca < 0) throw new IllegalArgumentException("A força não podeser negativa");
        this.forca = forca;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        if (forca < 1) throw new RecursoInsuficienteException("Força insuficiente para atacar!");
        System.out.println("O guerreiro " + getNome() + " atacou com sua espda!");
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        if (forca < 1) throw new RecursoInsuficienteException("Força insuficiente para usar habilidade especial!");
        System.out.println("O guerreiro " + getNome() + " usou Gopel Brutal!");
    }
}