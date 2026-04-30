package Atividade_06;

public class Arqueiro extends Personagem implements HabilidadesEspeciais {
    private int flechas;

    public Arqueiro(String nome, int nivel, int vida, int flechas) {
        super(nome, nivel, vida);
        this.setFlechas(flechas);
    }

    public void setFlechas(int flechas) {
        if (flechas < 0) throw  new IllegalArgumentException("Flechas insuficiente!");
        this.flechas = flechas;
    }

    @Override
    public void usarHabilidadesEspeciais() throws RecursoInsuficienteException {
        try {

            if (this.flechas < 3) {
                throw new RecursoInsuficienteException("Flechas insuficiente!");
            }

            this.flechas -= 3;
            System.out.println("O arqueiro " + this.getNome() + " usou Chuva de Flechas!");

        } catch (RecursoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public void atacar() throws RecursoInsuficienteException {
        try {

            if (this.flechas <= 0) {
                throw new RecursoInsuficienteException("O arqueiro está sem flechas!");
            }

            this.flechas--;
            System.out.println("O arqueiro " + getNome() + " disparou uma flecha!");

        } catch (RecursoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}