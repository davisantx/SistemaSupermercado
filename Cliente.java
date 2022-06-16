package com.mycompany.supermercado;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Entidade {
    protected String nome;
    protected String cpf;
    protected String numTelefone;
    private Date dataNascimento;
    Cartao cartao;

    Cliente(int i, String nome, Date dataNasc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
    public Date getDataNascimento(String formato) {
        return dataNascimento;
    }


    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String toString() {
        return String.format("Código: %d - Nome: %s - Data Nasc.: %s",
                this.getCodigo(), 
                this.getNome(), 
                this.getDataNascimento("dd/MM/yyyy"));
    }
    Cliente(String nomeCliente, String cpf, Cartao cartao, int codigo, Date dataNasc) {
      this.nome = nomeCliente;
      this.cpf = cpf;
      this.cartao = cartao;
      super.setCodigo(codigo);
      this.dataNascimento = dataNasc;
    }


    
}
