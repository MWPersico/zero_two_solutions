package br.senac.ead.zero_two_solutions.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_professor")
public class Professor extends Pessoa{

    private Integer matricula;
    private String titulacao;
    private String tipoVinculo;
    private Double salario;
    private Integer cargaHoraria;
    private String CPF;
    private Date dataNascimento;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private Set<Disciplina> disciplinas = new HashSet<>();

    public Professor(){}

    public Professor(Integer id, String nome, String endereco, String telefone, String CPF, Date dataNascimento, Integer matricula, String titulacao, String tipoVinculo, Double salario, Integer cargaHoraria) {
        super(id, nome, endereco, telefone);
        this.matricula = matricula;
        this.titulacao = titulacao;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
