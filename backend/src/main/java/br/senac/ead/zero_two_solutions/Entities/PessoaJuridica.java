package br.senac.ead.zero_two_solutions.Entities;

import jakarta.persistence.*;

// As classe fornecedo não herda de PessoaJuridica por problemas com a JPA
@Entity
@Table(name = "tb_pessoa_juridica")
public class PessoaJuridica extends Pessoa{

    private String CNPJ;

    public PessoaJuridica(){}

    public PessoaJuridica(Integer id, String nome, String endereco, String telefone, String CNPJ) {
        super(id, nome, endereco, telefone);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
