package br.senac.ead.zero_two_solutions.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor extends Pessoa {

    private String contrato;
    private String produto;
    private String tipoServico;
    private Date inicioVigencia;
    private Date fimVigencia;
    private String cnpj;

    public Fornecedor(){}

    public Fornecedor(Integer id, String nome, String endereco, String telefone, String cnpj, String contrato, String produto, String tipoServico, Date inicioVigencia, Date fimVigencia) {
        super(id, nome, endereco, telefone);
        this.contrato = contrato;
        this.produto = produto;
        this.tipoServico = tipoServico;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cpnj) {
        this.cnpj = cpnj;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }
}