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
        if (forca < 0) throw new IllegalArgumentException("A força não pode ser negativa!");
        this.forca = forca;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException{
        System.out.println("O guerreiro " + getNome() + " atacou com a espada!");
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        System.out.println("O guerreiro " + getNome() + " usou Golpe Brutal!");
    }
}