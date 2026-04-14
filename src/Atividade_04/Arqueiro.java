package Atividade_04;

public class Arqueiro extends Personagem {
    private int flechas;

    public Arqueiro(String nome) {
        super(nome);
        this.flechas = 5;
    }

    @Override
    void atacar() {
        // CORREÇÃO: Usar temEstaminas() em vez de isEmDefesa()
        if (this.temEstaminas() && this.flechas > 0) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            this.flechas--;
            System.out.println(this.getNome() + ": Disparou uma flecha!");

        } else if (this.flechas <= 0) {

            System.out.println(this.getNome() + ": Está sem flechas!");

        } else {

            this.perderVida(1);
            System.out.println(this.getNome() + ": Exausto demais para puxar o arco! Levou dano.");
        }
    }

    @Override
    void defesa() {
        if (this.temEstaminas()) {

            this.setQuantidadeDeEstaminas(this.getQuantidadeDeEstaminas() - 1);
            System.out.println(this.getNome() + ": Esquivou!");

        } else {

            perderVida(1);
            System.out.println(this.getNome() + ": Sem fôlego para esquivar! Levou dano.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Flechas: " + flechas + "]";
    }
}