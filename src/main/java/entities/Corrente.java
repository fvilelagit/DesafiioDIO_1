package entities;

public class Corrente extends Conta {

    private static int COUNT_C = 500;

    public Corrente(double saldo) {
        super();
        this.saldo=saldo;
        this.numero = COUNT_C;
        COUNT_C++;
    }

    @Override
    public void consultarSaldo() {

    }

    @Override
    public void tranferência(Conta contaOrigem, Conta contaDestino) {

    }

    @Override
    public void apagarConta() {

    }

    @Override
    public String toString() {
        return "Corrente { " +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                " }";
    }
}
