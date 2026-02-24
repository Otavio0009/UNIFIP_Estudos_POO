package AtividadeDeFixacao;

public class BalancoTrimestral {
    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFulano = 23000;
        int gastosMarco = 17000;

        int gastosTrimestral = gastosJaneiro + gastosFulano + gastosMarco;
        int media = gastosTrimestral / 3;

        System.out.println(gastosTrimestral);
        System.out.println("Valor da media mensal: " + media);
    }
}
