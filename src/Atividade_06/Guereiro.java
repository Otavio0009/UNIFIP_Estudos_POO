package Atividade_06;

public class Guereiro extends Personagem implements HabilidadesEspeciais {
    private int forca;

    public Guereiro(String noma, int nivel, int vida, int forca) {
        super(noma, nivel, vida);
        this.setForca(forca);
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca < 0) throw new IllegalArgumentException("Força não pode ser menro que zero!");
        this.forca = forca;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        if (this.getForca() < 1) throw new RecursoInsuficienteException("Força não pode ser negativa!");

        System.out.println("O gurreiro " + getNoma() + " atacou sua espada!");
        this.forca --;
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        if (this.getForca() < 5) throw new RecursoInsuficienteException("Força insuficiente para usar habilidade especial!");

        System.out.println("O guerreiro " + this.getNoma() + " usou Golpe Brutal!");
        this.forca -= 5;


    }
}