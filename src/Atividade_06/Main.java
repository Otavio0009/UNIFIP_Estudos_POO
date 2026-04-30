package Atividade_06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            try {
                System.out.println("===== ARENA DE TREINAMENTO =====");
                System.out.println("1- Cadastrar Guerreiro");
                System.out.println("2- Cadastrar Mago");
                System.out.println("3- Cadastrar Arqueiro");
                System.out.println("4- Listar personagens");
                System.out.println("5- Atacar com todos os personagens");
                System.out.println("6- Usar habilidades especiais");
                System.out.println("7- Ação individual (Desafio)");
                System.out.println("8- Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                    case 2:
                    case 3:
                        cadastrar(opcao, personagens, sc);
                        break;
                    case 4:
                        for (Personagem p : personagens) {
                            System.out.println("Tipo: " + p.getClass().getSimpleName());

                            p.status();
                            System.out.println("----");
                        }
                        break;
                    case 5:
                        for (Personagem p : personagens) {
                            try { p.atacar(); }
                            catch (RecursoInsuficienteException e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                        break;
                    case 6:
                        for (Personagem p : personagens) {
                            if (p instanceof HabilidadesEspeciais) {
                                try { ((HabilidadesEspeciais) p).usarHabilidadesEspeciais(); }
                                catch (RecursoInsuficienteException e) {
                                    System.out.println("Erro: " + e.getMessage());
                                }
                            }
                        }
                        break;
                    case 7:
                        acaoIndividual(personagens, sc);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite novamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 8);
    }

    private static void cadastrar(int tipo, ArrayList<Personagem> lista, Scanner sc) {
        try {
            System.out.print("Nome: "); String nome = sc.nextLine();
            System.out.print("Nível: "); int nivel = sc.nextInt();
            System.out.print("Vida: "); int vida = sc.nextInt();

            if (tipo == 1) {

                System.out.print("Força: "); int f = sc.nextInt();
                lista.add(new Guereiro(nome, nivel, vida, f));

            } else if (tipo == 2) {

                System.out.print("Mana: "); int m = sc.nextInt();
                lista.add(new Mago(nome, nivel, vida, m));

            } else {

                System.out.print("Flechas: "); int fl = sc.nextInt();
                lista.add(new Arqueiro(nome, nivel, vida, fl));
            }

            System.out.println("Cadastrdo com ucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }

    private static void acaoIndividual(ArrayList<Personagem> lista, Scanner sc) {
        System.out.print("Digite o nome do personagem: ");
        String busca = sc.nextLine();

        Personagem encontrado = null;

        for (Personagem p : lista) {
            if (p.getNome().equals(busca)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            System.out.print("1 - Atacar\n2 - Habilidade Especial");
            int acao = sc.nextInt();

            try {
                if (acao == 1) encontrado.atacar();
                else if (encontrado instanceof HabilidadesEspeciais) ((HabilidadesEspeciais) encontrado) .usarHabilidadesEspeciais();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } else {

            System.out.println("Nenhum personagem encontrado!");
        }
    }
}