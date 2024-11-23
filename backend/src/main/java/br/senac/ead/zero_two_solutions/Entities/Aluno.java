package br.senac.ead.zero_two_solutions.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_aluno")
public class Aluno extends Pessoa{

    private Integer matricula;
    private Boolean bolsista;
    private String tipoCurso;
    private Integer periodo;
    private Date dataDeIngresso;
    private String CPF;
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    @JsonIgnoreProperties({"disciplinas", "alunos"})
    private Curso curso;

    public Aluno(){}

    public Aluno(Integer id, String nome, String endereco, String telefone, Integer matricula, Boolean bolsista, String tipoCurso, Curso curso, Integer periodo, Date dataDeIngresso, String CPF, Date dataNascimento) {
        super(id, nome, endereco, telefone);
        this.matricula = matricula;
        this.bolsista = bolsista;
        this.tipoCurso = tipoCurso;
        this.curso = curso;
        this.periodo = periodo;
        this.dataDeIngresso = dataDeIngresso;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Boolean getBolsista() {
        return bolsista;
    }

    public void setBolsista(Boolean bolsista) {
        this.bolsista = bolsista;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Date getDataDeIngresso() {
        return dataDeIngresso;
    }

    public void setDataDeIngresso(Date dataDeIngresso) {
        this.dataDeIngresso = dataDeIngresso;
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
