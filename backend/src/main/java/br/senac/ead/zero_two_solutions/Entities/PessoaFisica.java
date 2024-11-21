package br.senac.ead.zero_two_solutions.Entities;

import jakarta.persistence.*;

import java.util.Date;

// As classes professor e aluno não herdam de PessoaFisica por problemas com a JPA
@Entity
@Table(name = "tb_pessoa_fisica")
public class PessoaFisica extends Pessoa{

    private String CPF;
    private Date dataNascimento;

    public PessoaFisica(){}

    public PessoaFisica(Integer id, String nome, String endereco, String telefone, String CPF, Date dataNascimento) {
        super(id, nome, endereco, telefone);
        this.id = id;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
