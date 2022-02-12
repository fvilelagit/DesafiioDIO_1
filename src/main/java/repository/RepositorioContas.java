package repository;

import entities.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioContas {

    private List <Conta> contas = new ArrayList<>();

    public RepositorioContas(List<Conta> contas) {
        this.contas = contas;
    }

    public RepositorioContas() {

    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta salvar(Conta c){
        contas.add(c);
        System.out.println("Conta salva com sucesso.");
        return c;
    }

    public void salvarTodos(List<Conta> c){
        this.contas.addAll(c.stream().collect(Collectors.toList()));
        System.out.println("Contas salvas com sucesso.");
    }

    public void apagar (int numeroConta){
        this.contas.removeIf(c -> c.getNumero() == numeroConta);
        System.out.printf("A conta %d foi removida com sucesso. \n", numeroConta);
    }

    public void exibirContas(){
        for(Conta c : this.contas){
            System.out.println("---- " + c + " ----");
        }
    }


}
