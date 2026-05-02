package Atividade_06;

public class Mago extends Personagem implements HabilidadesEspeciais {
    private int mana;

    public Mago(String noma, int nivel, int vida, int mana) {
        super(noma, nivel, vida);
        this.setMana(mana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 1) throw new IllegalArgumentException("Mana não pode ser negativa!");
        this.mana = mana;
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        if (this.getMana() > 10) {

            System.out.println("O mago " + getNoma() + " usou Tempestade Arcana!");
            this.mana -= 10;

        } else {

            throw new RecursoInsuficienteException("Mana insuficiente para usar habilidade especial!");
        }
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        if (this.getMana() >= 1) {

            System.out.println("O mago " + getNoma() + " lançou bolo de fogo!");
            this.mana --;

        } else {

            throw new RecursoInsuficienteException("Mana insuficiente para atacar!");
        }
    }
}