import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.print("Digite seu peso: "); // Corrigido de "sua peso"
        double peso = input.nextDouble();

        System.out.println("\n--- Resumo dos Dados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");

        input.close(); // Boa prática fechar o scanner
    }
}