package com.mycompany.supermercado;

public class Produto {

    public Produto(String nome, String marca, String dtValidade, float preco) {
        this.nome = nome;
        this.marca = marca;
        this.dtValidade = dtValidade;
        this.preco = preco;
    }
    protected String nome;
    protected String marca;
    protected String dtValidade;
    protected float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  
    public String getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(String dtValidade) {
        this.dtValidade = dtValidade;
    }

    public float getPreco() {
        return preco;
    }


    public void setPreco(float preco) {
        this.preco = preco;
    }
}
