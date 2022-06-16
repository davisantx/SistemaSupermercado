package com.mycompany.supermercado;
  

public class Funcionario extends Entidade {
    Caixa caixa;
    protected String nome;
    protected int cod;

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    Funcionario(String nomeFuncionario, int codFuncionario) {
      this.nome = nomeFuncionario;
      this.cod = codFuncionario;
    }
}
