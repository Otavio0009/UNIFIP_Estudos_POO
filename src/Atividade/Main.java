package Atividade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Data hoje = new Data(11, 3, 2026);

        // --- Cadastro do Cliente 1 ---
        System.out.println(">>> CADASTRO CLIENTE 1 <<<");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("CPF: ");
        String cpf = teclado.nextLine();
        System.out.print("Número da Conta: ");
        int numConta1 = teclado.nextInt();
        teclado.nextLine();

        Cliente c1 = new Cliente(nome, cpf);
        Conta conta1 = new Conta(numConta1, c1);

        System.out.println("Bônus de gratificação! Saldo inicial: R$ 1000,00");
        conta1.depositar(1000.0, hoje);

        // --- Cadastro do Cliente 2 ---
        System.out.println("\n>>> CADASTRO CLIENTE 2 <<<");
        System.out.print("Nome: ");
        String nome2 = teclado.nextLine();
        System.out.print("CPF: ");
        String cpf2 = teclado.nextLine();
        System.out.print("Número da Conta: ");
        int numConta2 = teclado.nextInt();
        teclado.nextLine();

        Cliente c2 = new Cliente(nome2, cpf2);
        Conta conta2 = new Conta(numConta2, c2);

        System.out.println("Bônus de gratificação! Saldo inicial: R$ 1000,00");
        conta2.depositar(1000.0, hoje); // Corrigido: era conta1 antes

        // --- Menu de Opções ---
        System.out.println("\n--- OPERAÇÕES BANCÁRIAS (Titular: " + c1.getNome() + ") ---");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Transferir para " + c2.getNome());
        System.out.print("Escolha uma opção: ");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.print("Valor para Depósito: ");
            double valor = teclado.nextDouble();
            conta1.depositar(valor, hoje);
            System.out.println("Depósito realizado com sucesso!");
        }
        else if (opcao == 2) {
            System.out.print("Valor para Saque: ");
            double valor = teclado.nextDouble();
            conta1.sacar(valor, hoje);
        }
        else if (opcao == 3) {
            System.out.print("Valor para Transferência: ");
            double valor = teclado.nextDouble();
            conta1.transferir(valor, conta2, hoje);
        }
        else {
            System.out.println("Opção inválida! Exibindo apenas o resumo.");
        }

        // --- Resultados Finais ---
        System.out.println("\n--- EXTRATO FINAL ---");
        conta1.resumo();

        if (opcao == 3) {
            System.out.println("--- EXTRATO DESTINO ---");
            conta2.resumo();
        }

        teclado.close();
    }
}