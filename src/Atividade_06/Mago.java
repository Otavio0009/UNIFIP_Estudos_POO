package Atividade_06;

public class Mago extends Personagem implements HabilidadesEspeciais{
    private int mana;

    public Mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida);
        setMana(mana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) throw new IllegalArgumentException("Mana não pode ser negativa!");
        this.mana = mana;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        System.out.println("O mago " + getNome() + " lançou bola de fogo!");
        mana --;
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        if (mana < 10) throw new RecursoInsuficienteException("Mana insuficiente para usar habilidade especial!");

        System.out.println("O mago " + getNome() + " usaou Tempestade Arcana!");
        mana -= 10;
    }
}