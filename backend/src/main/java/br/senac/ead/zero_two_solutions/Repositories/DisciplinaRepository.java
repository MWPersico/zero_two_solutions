package br.senac.ead.zero_two_solutions.Repositories;

import br.senac.ead.zero_two_solutions.Entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
