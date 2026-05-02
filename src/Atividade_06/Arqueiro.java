package Atividade_06;

public class Arqueiro extends Personagem implements HabilidadesEspeciais{
    private int flechas;

    public Arqueiro(String noma, int nivel, int vida, int flechas) {
        super(noma, nivel, vida);
        this.setFlechas(flechas);
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        if (flechas < 1) throw new IllegalArgumentException("Flechas não podem ser menro que 1!");
        this.flechas = flechas;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        try {
            if (this.getFlechas() >= 1) {
                System.out.println("O arquiero " + this.getNoma() + " atirou uma flecha!");
                this.flechas --;
            } else {
                throw new RecursoInsuficienteException("Flechas insuficientes!");
            }
        } catch (RecursoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        try {
            if (this.getFlechas() >= 3) {
                System.out.println("O arqueiro " + this.getNoma() + " usou Chuva de Flechas!");
                this.flechas -= 3;
            } else {
                throw new RecursoInsuficienteException("Flechas insuficientes para usar habilidade especial!");
            }
        } catch (RecursoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}