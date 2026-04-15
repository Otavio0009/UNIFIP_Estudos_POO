package Atividade_05;

public class Circulo {
    private double raio;
    private double pi = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (this.raio * this.raio) * this.pi;
    }
}
