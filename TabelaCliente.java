package com.mycompany.supermercado;

import java.util.ArrayList;

public class TabelaCliente extends Tabela {
    @Override
    public String listar() {
        String resultado = "";
        for (int i = 0; i < tabela.size(); ++i) {
            Cliente c = (Cliente) tabela.get(i);
            resultado += c;
            resultado += "\n";
        }
        return resultado;
    }
}



