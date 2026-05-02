package Atividade_06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static void acaoIndividual(ArrayList<Personagem> lista, Scanner sc) {
        System.out.print("Digite o nome do personagem: "); String busca = sc.nextLine();

        Personagem encontrado = null;

        for (Personagem p : lista) {
            if (p.getNoma().equals(busca)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            System.out.println("1- Atacar\n2- Habilidade Especial"); int acao = sc.nextInt();

            try {
                if (acao == 1) {
                    encontrado.atacar();
                } else if (acao == 2) {
                    ((HabilidadesEspeciais) encontrado).usarHabilidadeEspecial();
                }
            } catch (RecursoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } else {

            System.out.println("Personagem não enontrado");
        }
    }

    private static void cadastrar (int tipo, ArrayList<Personagem> lista, Scanner sc) {
        try {
            System.out.print("Nome: "); String nome = sc.nextLine();
            System.out.print("Vida: "); int vida = sc.nextInt();
            System.out.print("Nível: "); int nivel = sc.nextInt();

            if (tipo == 1) {
                System.out.print("Força: "); int forca = sc.nextInt();
                lista.add(new Guereiro(nome, nivel, vida, forca));
            } else if (tipo == 2) {
                System.out.print("Mana"); int mana = sc.nextInt();
                lista.add(new Mago(nome, nivel, vida, mana));
            } else if (tipo == 3) {
                System.out.println("Flechas: "); int flechas = sc.nextInt();
                lista.add(new Arqueiro(nome, nivel, vida, flechas));
            }

            System.out.println("Cadastrado realizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro de cadastro: " + e.getMessage());
        }
    }

    static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

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

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                    case 2:
                    case 3:
                        cadastrar(opcao, personagens,sc);
                        break;
                    case 4:
                        for (Personagem p : personagens) {
                            System.out.println("Tipo: " + p.getClass().getSimpleName());
                            p.exibirStatus();
                        }
                        break;
                    case 5:
                        for (Personagem p : personagens) {
                            try { p.atacar();} catch (RecursoInsuficienteException e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                        break;
                    case 6:
                        for (Personagem p : personagens) {
                            if (p instanceof HabilidadesEspeciais) {
                                try {
                                    ((HabilidadesEspeciais) p).usarHabilidadeEspecial();
                                } catch (RecursoInsuficienteException e) {
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
                System.out.println("Entrada invalida. Digite novamente!");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 8);
    }
}