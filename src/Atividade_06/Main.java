package Atividade_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            try {
                System.out.println("===== ARENA DE TREINAMENTO =====\n" +
                        "1 - Cadastrar Guerreiro\n" +
                        "2 - Cadastrar Mago\n" +
                        "3 - Cadastrar Arqueiro\n" +
                        "4 - Listar personagens\n" +
                        "5 - Atacar com todos os personagens\n" +
                        "6 - Usar habilidades especiais\n" +
                        "7 - Usar apenas um personagem\n"  +
                        "8 - Sair");

                opcao = Integer.parseInt(sc.nextLine());

                if (opcao >= 1 && opcao <= 3) {
                    if (opcao == 1) {
                        System.out.println("Você escolhei a classe Guerreiro:");
                        System.out.println("Nome: "); String nome = sc.nextLine();
                        System.out.println("Nível: "); int nivel = Integer.parseInt(sc.nextLine());
                        System.out.println("Vida: "); int vida = Integer.parseInt(sc.nextLine());
                        System.out.println("Força: "); int forca = Integer.parseInt(sc.nextLine());

                        personagens.add(new Guereiro(nome, nivel, vida, forca));
                    } else if (opcao == 2) {
                        System.out.println("Você escolhei a classe Mago:");
                        System.out.println("Nome: "); String nome = sc.nextLine();
                        System.out.println("Nível: "); int nivel = Integer.parseInt(sc.nextLine());
                        System.out.println("Vida: "); int vida = Integer.parseInt(sc.nextLine());
                        System.out.println("Mana: "); int mana = Integer.parseInt(sc.nextLine());

                        personagens.add(new Mago(nome, nivel, vida, mana));
                    } else if (opcao == 3) {
                        System.out.println("Você escolhei a classe Arqueiro:");
                        System.out.println("Nome: "); String nome = sc.nextLine();
                        System.out.println("Nível: "); int nivel = Integer.parseInt(sc.nextLine());
                        System.out.println("Vida: "); int vida = Integer.parseInt(sc.nextLine());
                        System.out.println("Flechas: "); int flechas = Integer.parseInt(sc.nextLine());

                        personagens.add(new Arqueiro(nome, nivel, vida, flechas));
                    }
                } else if (opcao == 4) {
                    for (Personagem p : personagens) {
                        System.out.println("Tipo: " + p.getClass().getSimpleName());
                        p.status();
                    }
                } else if (opcao == 5) {
                    for (Personagem p : personagens) {
                        try {
                            p.atacar();
                        } catch (Exception e) {
                            System.out.println("Erro ao atacar: " + e.getMessage());
                        }
                    }

                } else if (opcao == 6) {
                    for (Personagem p : personagens) {
                        if (p instanceof HabilidadesEspeciais) {
                            try {
                                ((HabilidadesEspeciais) p).usarHabilidadeEspecial();
                            } catch (Exception e) {
                                System.out.println("Erro ao usar abilidade especial: " + e.getMessage());
                            }
                        }
                    }
                } else if (opcao == 7) {
                    System.out.println("Digite o nome do personagem: ");String buscar = sc.nextLine();
                    boolean encontrar = false;

                    for (Personagem p : personagens) {
                        if (p.getNome().equalsIgnoreCase(buscar)) {
                            encontrar = true;
                            System.out.println("Escolha a ação:\n" +
                                    "1 - Atacar\n" +
                                    "2 - Usar habilidade especial");
                            int acao = Integer.parseInt(sc.nextLine());
                            try {
                                if (acao == 1) {
                                    p.atacar();
                                } else if (acao == 2) {
                                    if (p instanceof HabilidadesEspeciais) {
                                        ((HabilidadesEspeciais)p).usarHabilidadeEspecial();
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("Erro ao tentar atcar ou usar habilidade especial: " + e.getMessage());
                            }
                            break;
                        }
                    } if (!encontrar) System.out.println("Personagem não encontrado!");

                } else if (opcao == 8) System.out.println("Saindo...");
            } catch (NumberFormatException e) {
                System.out.println("Opção invalida. Tente novamente!");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 8);

        sc.close();
    }
}