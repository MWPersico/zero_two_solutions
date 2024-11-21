package br.senac.ead.zero_two_solutions.Entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany
    @JoinTable(
            name = "tb_curso_disciplina",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private Set<Disciplina> disciplinas = new HashSet<>();

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(){}

    public Curso(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public Set<Aluno> getAlunos(){
        return alunos;
    }
}