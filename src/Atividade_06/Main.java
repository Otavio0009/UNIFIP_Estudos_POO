package Atividade_06;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            try {
                System.out.println("===== Arenade de Treinamento =====");
                System.out.println("1- Cadastrar Guerreiro");
                System.out.println("2- Cadastrar Mago");
                System.out.println("3- Cadastrar Arqueiro");
                System.out.println("4- Lista de personagens");
                System.out.println("5- Atacra com todos os personagens");
                System.out.println("6- Usar habilidade especial");
                System.out.println("7- Atacar e usar habilidade especial de apenas um personagem");
                System.out.println("8- Sair");
                opcao = Integer.parseInt(sc.nextLine());

                if (opcao >= 1 && opcao <= 3) {
                    if (opcao == 1) {
                        System.out.println("Você escolhei o Guerreiro:");
                        System.out.println("Nome: "); String nome = sc.nextLine();
                        System.out.println("Nível: "); int nivel = Integer.parseInt(sc.nextLine());
                        System.out.println("Vida: "); int vida = Integer.parseInt(sc.nextLine());
                        System.out.println("Força: "); int forca = Integer.parseInt(sc.nextLine());

                        personagens.add(new Guereiro(nome, nivel, vida, forca));
                    } else if (opcao == 2) {
                        System.out.println("Você escolheu o Mago:");
                        System.out.println("Nome: "); String nome = sc.nextLine();
                        System.out.println("Nível: "); int nivel = Integer.parseInt(sc.nextLine());
                        System.out.println("Vida: "); int vida = Integer.parseInt(sc.nextLine());
                        System.out.println("Mana: "); int mana = Integer.parseInt(sc.nextLine());

                        personagens.add(new Mago(nome, nivel, vida, mana));
                    } else if (opcao == 3) {
                        System.out.println("Você escolheu o Arqueiro:");
                        System.out.println("Nome: "); String nome = sc.nextLine();
                        System.out.println("Nível: "); int nivel = Integer.parseInt(sc.nextLine());
                        System.out.println("Visda: "); int vida = Integer.parseInt(sc.nextLine());
                        System.out.println("Mana: "); int mana = Integer.parseInt(sc.nextLine());

                        personagens.add(new Arqueiro(nome, nivel, vida, mana));
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
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                } else if (opcao == 6) {
                    for (Personagem p : personagens) {
                        if (p instanceof HabilidadesEspeciais) {
                            try {
                                ((HabilidadesEspeciais) p).usarHabilidadeEspecial();
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                    }
                } else if (opcao == 7) {
                    System.out.println("Informe o nome do personagem: "); String busca = sc.nextLine();
                    boolean encontrar = false;

                    for (Personagem p : personagens) {
                        if (p.getNome().equalsIgnoreCase(busca)) {

                            System.out.println("1- Atacar");
                            System.out.println("2- Usar Habilidade Especial");

                            int acao = Integer.parseInt(sc.nextLine());

                            try {
                                if (acao == 1) {
                                    p.atacar();
                                } else if (acao == 2) {
                                    if (p instanceof HabilidadesEspeciais) {
                                        ((HabilidadesEspeciais) p).usarHabilidadeEspecial();
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                        break;
                    }

                    if (!encontrar) {
                        System.out.println("Personagem não cadastrado!");
                    }
                } else if (opcao == 8) {
                    System.out.println("Saindo...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Tente novamnete!");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 8);

        sc.close();
    }
}