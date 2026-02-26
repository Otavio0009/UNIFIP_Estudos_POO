package Aula_01.PrimeiraAtividadeDeFixacao;
import java.util.Scanner;

public class ExercicioOpicional_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");

        int opcao = input.nextInt();

        for (int i = 1; i <= opcao; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
