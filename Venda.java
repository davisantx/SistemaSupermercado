package com.mycompany.supermercado;

public class Venda {
    String data;
    Produto produto;
    Cliente cliente;
    Funcionario funcionario;

    public Venda(String data, Produto produto, Cliente cliente, Funcionario funcionario) {
        this.data = data;
        this.produto = produto;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
}
