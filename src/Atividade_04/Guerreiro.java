package Atividade_04;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        if (this.temEstaminas()) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            System.out.println(getNome() + ": Atacou com a espada!");

        } else {

            perderVida(1);
            System.out.println(getNome() + ": exausto! Falhou no ataque e levou dano.");
        }
    }

    @Override
    void defesa() {
        if (this.temEstaminas()) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            System.out.println(getNome() + ": Defendeu com o escudo!");

        } else {

            perderVida(1);
            System.out.println(getNome() + ": sem estamina para defender! Levou dano.");
        }
    }
}