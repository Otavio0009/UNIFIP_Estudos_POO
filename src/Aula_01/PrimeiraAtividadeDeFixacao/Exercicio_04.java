package Aula_01.PrimeiraAtividadeDeFixacao;

public class Exercicio_04 {
    public static void main(String[] args) {

         int fatorial = 1;

         for (int f = 1; f <= 10; f ++) {
            fatorial *= f;

            System.out.println("O fatorial de " + f + "!" + " é "  + fatorial);
        }
    }
}
