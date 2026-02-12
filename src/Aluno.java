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
}
