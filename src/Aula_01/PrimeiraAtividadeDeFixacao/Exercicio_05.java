package Aula_01.PrimeiraAtividadeDeFixacao;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int numero = input.nextInt();
        long fatorial = 1;

        for (long f = 1; f <= numero; f ++) {
            fatorial *= f;

            System.out.println("O fatorial de " + f + "!" + " é "  + fatorial);
        }

        input.close();
    }
}
