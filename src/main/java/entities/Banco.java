package entities;

import repository.RepositorioContas;

import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes;
    private RepositorioContas contas;

    public Banco(String nome, RepositorioContas contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public Banco(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public RepositorioContas getContas() {
        return contas;
    }

}
