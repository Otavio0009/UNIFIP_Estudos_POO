package Atividade_06;

public class Guereiro extends Personagem implements HabilidadesEspeciais{
    private int forca;

    public Guereiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        this.setForca(forca);
    }

    public void setForca(int forca) {
        if (forca < 0) throw  new IllegalArgumentException("Força não pode ser negativo!");
        this.forca = forca;
    }

    @Override
    public void usarHabilidadesEspeciais() throws RecursoInsuficienteException {
        System.out.println("O guereiro " + this.getNome() + " usou Golpe Brutal!");
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro " + this.getNome() + " atacou com sua espada!");
    }
}