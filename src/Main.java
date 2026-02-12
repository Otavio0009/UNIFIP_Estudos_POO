import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "Otavio";
        a1.nota = 10;
        a1.idade = 19;
        a1.ativo = true;

        a1.estudar("POO");

        System.out.println(a1.nota);

        a1.adicionarNotas(8);

        System.out.println(a1.nota);
    }
}