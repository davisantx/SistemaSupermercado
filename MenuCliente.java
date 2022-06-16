
package com.mycompany.supermercado;

import java.util.Date;
public class MenuCliente {
  
    public static boolean cadastrar(TabelaCliente ta) {
        System.out.println("Cadastrar Cliente");
        MenuPrinter.separador(80);
        String nome = Keyin.inStr("Nome do aluno: ");
        Date dataNasc = Keyin.inDate("Data de nasc. (dd/MM/yyyy): ", "dd/MM/yyyy");
        return ta.criar(new Cliente(ta.tamanho() + 1, nome, dataNasc));
    }
    public static boolean atualizar() {
        System.out.println("***** Atualizar Cliente\n\n");
        return true;
    }
    public static boolean listar(TabelaCliente ta) {
        System.out.println("Listagem dos Clientes");
        MenuPrinter.separador(80);
        System.out.println(ta.listar());
        MenuPrinter.separador(80);
        return true;
    }
}

