package ProjetoBiblioteca;

public class SistemaBibliotecario {
    public static void main(String[] args) {
        Livro livro1 = new Livro(101, "Dom Casmurro", "Machado de Assis");

        livro1.emprestar("10/03/2026", "Carlos");
        livro1.devolucao("15/03/2026", "Otávio");
        livro1.reservado("16/03/2026", "Mariana");
        livro1.emprestar("18/03/2026", "Mariana");

        livro1.resumo();
    }
}
