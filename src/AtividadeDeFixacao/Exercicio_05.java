package AtividadeDeFixacao;

public class Exercicio_05 {
    public static void main(String[] args) {
        long fatorial = 1;

        for (long f = 1; f <= 40; f ++) {
            fatorial *= f;

            System.out.println(f + " != " + fatorial);
        }
    }
}
