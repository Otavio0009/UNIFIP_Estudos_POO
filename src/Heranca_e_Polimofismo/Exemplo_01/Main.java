package Heranca_e_Polimofismo.Exemplo_01;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Otávio");
        g1.setCpf("123-456-789.00");
        g1.setSalario(12000);
        g1.setSenha(12345);

        g1.autentica(12345);
        System.out.println(g1.getBonificacao());

        ControleDeBonificacao controle = new ControleDeBonificacao();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registrar(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registrar(funcionario2);

        System.out.println(controle.getTotalBonificacao());

    }
}
