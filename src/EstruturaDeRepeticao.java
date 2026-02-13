import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // WHILE
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        while (idade < 0){
            System.out.println(idade);
            idade ++;
        }

        // FOR

        for (int i = 1; i < 10; i ++){
            System.out.println(i);
        }

        int x = 10;
        int y = 1000;

        for (int i = x; i < y; i ++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisível por 19 entre x e y " + i);
                break;
            }
        }

        for (int i = 0; i < 100; i ++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }

        
    }
}
