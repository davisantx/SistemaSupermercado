
package com.mycompany.supermercado;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class SistemaSupermercado {
    private TabelaCliente tabAluno = new TabelaCliente();
    private MenuPrincipal menuPrinc = new MenuPrincipal("Sistema Supermercado");
    private Callable<Boolean> nada = ()->{return false;};
    SistemaSupermercado() {
        criarMenuCliente();
        criarMenuCaixas();
        menuPrinc.adicItem(new Item(9, "Sair", nada));
    }
    private void criarMenuCliente() {
        Item clientes = new Item(1, "Clientes", nada);
        TabelaCliente tabClientes = null;
        List<Item> subitens = List.of(
            new Item(1, "Cadastrar", ()-> MenuCliente.cadastrar(tabClientes)),
            new Item(2, "Atualizar", ()-> MenuCliente.atualizar()),
            new Item(3, "Listar", ()-> MenuCliente.listar(tabClientes)),
            new Item(4, "Voltar", ()-> MenuPrincipal.voltar())
        );


        for(Item item: subitens) {
            clientes.adicSubitem(item);
        }
        menuPrinc.adicItem(clientes);
    }
    public void iniciar() {
        menuPrinc.exibir();
    }

    private void criarMenuCaixas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


