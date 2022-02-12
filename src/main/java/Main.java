import entities.*;
import repository.RepositorioContas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args){
        RepositorioContas rContas = new RepositorioContas();
        List<Conta> lista = new ArrayList<>();
        List <String> nintendoNames = new ArrayList (Arrays.asList("Mario","Peach","Bowser","Koopa","Link",
                        "Zelda", "Malon", "Gannondorf", "Saria","Goron"));

        Banco banco = new Banco("Mushroom Coins", rContas);

        Conta c1 = new Corrente(6000.2);
        Conta p1 = new Poupança(100);
        Conta c2 = new Corrente(700.0);
        Conta p2= new Poupança(100.0);
        Conta c3 = new Corrente(3000.50);
        Conta p3= new Poupança(900);
        Conta c4 = new Corrente(10000);
        Conta p4= new Poupança(2600);
        Conta c5 = new Corrente(3500);
        Conta p5 = new Poupança(1000);

        lista.addAll(Arrays.asList(c1,c2,c3,c4,c5,p1,p2,p3,p4,p5));

        int count= 0;
        for(Conta a : lista){
            a.setCliente(new Cliente(nintendoNames.get(count)));
            count++;
        }

        rContas.salvarTodos(lista);

        p5.tranferencia(200.00,c4);
        c1.depositar(100.00,c1);
        p2.sacar(500);
        p3.tranferencia(200, c2);

        System.out.println("+++++++ LOG DE USO +++++++++");

        rContas.exibirContas();
        rContas.apagar(503);
        rContas.exibirContas();

    }


}
