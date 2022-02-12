package entities;

public class Poupança extends Conta {

    private static int COUNT_P = 300;

    public Poupança(double saldo) {
        super();
         this.numero = COUNT_P;
        this.saldo=saldo;
        COUNT_P++;
    }

    public Poupança(){
        super();

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
        return "Poupança { " +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                " }";
    }
}
