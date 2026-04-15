package Atividade_05;

public class Quadro implements AreaCalculavel {
    private int lado;

    Quadro(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }
}
