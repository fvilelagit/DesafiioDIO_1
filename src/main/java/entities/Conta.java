package entities;

import services.ContaFunc;

public abstract class Conta implements ContaFunc {

    private static int AGENCIA_PADRAO = 100;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void tranferencia(double valor, Conta contaDestino) {
        if(this.saldo > valor) {
            this.sacar(valor);
            contaDestino.depositar(valor, contaDestino);
            System.out.printf("Transferência concluída. \n");
        }
        else{
            System.out.printf("O saldo desta conta é inferior a %d", valor);
        }
    }


    @Override
    public void depositar(double valor, Conta contaDestino){

        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        System.out.printf("Valor de R$ %.2f foi depositado na conta %d . \n", valor,contaDestino.getNumero());

    }

    @Override
    public void autoDeposito(double valor){
        this.saldo +=valor;
        System.out.printf("Valor de R$ %.2f foi depositado na própria conta [ %d ] . \n", valor, numero);
    }

    @Override
    public void sacar(double valor){
        if(this.saldo > valor) {
            saldo-=valor;
            System.out.printf("Valor de R$ %.2f foi sacado. ", valor);
            System.out.printf("Saldo da sua conta é de R$ %.2f. \n", saldo);
        }
        else{
            System.out.println("SAQUE INVÁLIDO / SEM SALDO SUFICIENTE NA CONTA");
        }

    }


}
