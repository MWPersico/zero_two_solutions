package br.senac.ead.zero_two_solutions.Repositories;

import br.senac.ead.zero_two_solutions.Entities.Aluno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends BaseRepository<Aluno, Integer> {
}
