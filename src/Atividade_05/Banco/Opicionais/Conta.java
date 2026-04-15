package Atividade_05.Banco.Opicionais;

public interface Conta {
    double getSaldo();
    void deposito(double valor);
    void retirar(double valor);
    void atualizar(double taxaSelic);
}
