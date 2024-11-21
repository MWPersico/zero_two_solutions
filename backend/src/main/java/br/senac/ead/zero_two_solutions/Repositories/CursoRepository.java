package br.senac.ead.zero_two_solutions.Repositories;

import br.senac.ead.zero_two_solutions.Entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
