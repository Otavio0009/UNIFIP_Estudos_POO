package Atividade_04;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome) {
        super(nome);
        this.mana = 5;
    }

    @Override
    void atacar() {
        if (this.mana > 0 && this.temEstaminas()) {

            this.mana--;
            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            System.out.println(this.getNome() + ": Lançou bola de fogo!");

        } else if (this.mana <= 0) {

            this.perderVida(1);
            System.out.println(getNome() + ": Sem mana! O feitiço falhou e causou exaustão.");

        } else {

            this.perderVida(1);
            System.out.println(this.getNome() + ": Sem estamina para conjurar! Levou dano.");
        }
    }

    @Override
    void defesa() {
        if (this.temEstaminas() && this.mana > 0) {

            this.mana--;
            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            System.out.println(this.getNome() + ": Criou escudo arcano!");

        } else {

            perderVida(1);
            System.out.println(this.getNome() + ": Falha na barreira mágica! Levou dano.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Mana: " + mana + "]";
    }
}