package Atividade_06;

public class Arqueiro extends Personagem implements HabilidadesEspeciais {
    private int flecha;

    public Arqueiro(String nome, int nivel, int vida, int flecha) {
        super(nome, nivel, vida);
        setFlecha(flecha);
    }

    public void setFlecha(int flecha) {
        if (flecha < 0) throw new IllegalArgumentException("A quantidade de Flechas não pode ser negativa!");
        this.flecha = flecha;
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        try {
            if (flecha >= 1) {
                System.out.println("O arqueiro " + getNome() + " atirou uma flechas!");
                flecha --;
            } else {
                throw new RecursoInsuficienteException("Não tem flechas para atacar");
            }
        } catch (RecursoInsuficienteException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }

    @Override
    public void usarHabilidadeEspecial() throws RecursoInsuficienteException {
        try {
            if (flecha >= 3) {
                System.out.println("O arqueiro " + getNome() + " usou Chuva de Flechas");
                flecha -= 3;
            } else {
                throw new RecursoInsuficienteException("Não tem flechas usuficiente para usar habilidade especial!");
            }
        } catch (RecursoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}