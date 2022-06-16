package com.mycompany.supermercado;

public interface Crud {
    public boolean criar(Entidade e);
    public Entidade atualizar(int codigo);
    public Entidade ler(int codigo);
    public boolean apagar(int codigo);
}
