package Atividade_06;

public class Arqueiro extends Personagem implements HabilidadesEspeciais{
    private int flechas;

    public Arqueiro(String nome, int nivel, int vida, int flechas) {
        super(nome, nivel, vida);
        setFlechas(flechas);
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        if (flechas < 0) throw new IllegalArgumentException("Flechas não podem ser negativas!");
        this.flechas = flechas;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        if (flechas > 0) {
            System.out.println("O arqueiro " + getNome() + " atirou uma flecha!");
            flechas --;
        } else {
            throw new RecursoInsuficienteException("Quantidade de flechas insuficientes para atacar!");
        }
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        try {
            if (flechas >= 3) {
                System.out.println("O arqueiro " + getNome() + " usou Chuva de Flechas!");
                flechas -= 3;
            } else {
                throw new RecursoInsuficienteException("Quantidade de flechas insuficiente para usar habilidade especial!");
            }
        } catch (RecursoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
            throw e;
        }
    }
}