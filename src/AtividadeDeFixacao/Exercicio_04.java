package AtividadeDeFixacao;

public class Exercicio_04 {
    public static void main(String[] args) {
         int fatorial = 1;

         for (int f = 1; f <= 10; f ++) {
            fatorial *= f;

            System.out.println(f + " != " + fatorial);
        }
    }
}
