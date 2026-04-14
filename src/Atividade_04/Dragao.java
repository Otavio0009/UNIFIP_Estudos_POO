package Atividade_04;

public class Dragao extends Personagem implements Voador {
    private int mana;

    public Dragao(String nome) {
        super(nome);
        this.setVida(20);
        this.setQuantidadeDeEstaminas(100);
        this.mana = 100;
    }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }

    @Override
    void atacar() {
        if (this.temEstaminas() && this.mana >= 10) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 2);
            this.mana -= 5;
            System.out.println(getNome() + ": Lançou um SOPRO DE FOGO!");

        } else if (this.temEstaminas()) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 3);
            System.out.println(getNome() + ": Sem mana para fogo, atacou com as GARRAS!");

        } else {

            this.perderVida(1);
            System.out.println(getNome() + ": Está exausto e não conseguiu atacar! Levou dano.");
        }
    }

    @Override
    void defesa() {
        if (this.temEstaminas()) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            System.out.println(getNome() + ": Usou as escamas para defender!");

        } else if (this.mana >= 20) {

            this.mana -= 10;
            System.out.println(getNome() + ": Usou uma barreira mágica de fogo!");

        } else {

            this.perderVida(1);
            System.out.println(getNome() + ": Indefeso! Levou dano.");
        }
    }

    @Override
    public void voar() {
        if (this.temEstaminas()) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 10);
            System.out.println(getNome() + ": Levantou voo!");

        } else {

            System.out.println(getNome() + ": Pesado demais para voar sem estamina!");
        }
    }
}