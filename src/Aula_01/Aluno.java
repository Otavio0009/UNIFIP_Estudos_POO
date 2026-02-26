package Aula_01;

public class Aluno {
    String nome;
    int idade;
    double nota;
    boolean ativo;

    void estudar(String materia) {
        System.out.println("O aluno está estudando " + materia);
    }

    void adicionarNotas(double novaNota) {
        nota = novaNota;
    }

    public static class Arrays {
        public static void main(String[] args) {
            int[] array = new int[4];
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;

            for (int arrays : array) {

                System.out.println(arrays);
            }

            /* for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }*/

            // outra forma

            System.out.println("----------------------");

            int[] valores = {9, 18, 27, 36};

            for (int valor : valores) {
                System.out.println(valor);
            }
        }
    }
}
