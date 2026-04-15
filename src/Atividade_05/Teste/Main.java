package Atividade_05.Teste;

import Atividade_05.AreaCalculavel;
import Atividade_05.Circulo;
import Atividade_05.Quadro;
import Atividade_05.Retangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Quadro quadro = new Quadro(4);
        Retangulo retangulo = new Retangulo(10.0, 5.0);

        System.out.println("--- Cálculo de Áreas ---");

        System.out.printf("Área do Círculo (raio 5.0): %.2f%n", circulo.calcularArea());

        System.out.println("Área do Quadro (lado 4): " + quadro.calcularArea());

        System.out.println("Área do Retângulo (10x5): " + retangulo.calcularArea());

        AreaCalculavel[] formas = {quadro, retangulo, circulo};

        System.out.println("--- Usando a Interface AreaCalculavel ---");

        for (AreaCalculavel forma : formas) {
            System.out.println("Resultado: " + forma.calcularArea());
        }
    }
}