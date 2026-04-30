package Atividade_06;

public class Mago extends Personagem implements HabilidadesEspeciais {
    private int mana;

    public Mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida);
        this.mana = mana;
    }

    public void setMana(int mana) {
        if (mana < 0) throw  new IllegalArgumentException("Mana insuficiente!");
        this.mana = mana;
    }

    @Override
    public void usarHabilidadesEspeciais() throws RecursoInsuficienteException {
        if (this.mana < 10) {
            throw new RecursoInsuficienteException("Mana insuficiente para usar habilidade especial!");
        }

        System.out.println("O mago " + this.getNome() + " usou Tempestade Arcana!");
        this.mana -= 10;
    }

    @Override
    public void atacar() {
        System.out.println("O mago " + this.getNome() + " lançou uma bola de fogo!");
    }
}