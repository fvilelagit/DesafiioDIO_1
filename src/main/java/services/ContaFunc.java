package services;

import entities.Conta;

public interface ContaFunc {



    void consultarSaldo();
    void tranferência(Conta contaOrigem, Conta contaDestino);
    void sacar(double valor);
    void depositar(double valor, Conta contaDestino);
    void apagarConta();
    public void autoDeposito(double valor);


}
