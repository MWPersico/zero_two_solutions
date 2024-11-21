package br.senac.ead.zero_two_solutions.Repositories;

import br.senac.ead.zero_two_solutions.Entities.Professor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends BaseRepository<Professor, Integer> {
}
