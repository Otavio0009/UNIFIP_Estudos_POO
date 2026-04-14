package Atividade_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> lista = new ArrayList<>();

        lista.add(new Guerreiro("Otávio"));
        lista.add(new Mago("Olívia"));
        lista.add(new Arqueiro("Ofélia"));
        lista.add(new Dragao("Orgnir"));

        System.out.println("--- Início da Simulação de Combate ---");

        for (Personagem p : lista) {

            System.out.println(p);

            p.andar();
            p.atacar();
            p.defesa();

            if (p instanceof Voador) {

                ((Voador) p).voar();
            }

            System.out.println("-------------------------");
        }
    }
}