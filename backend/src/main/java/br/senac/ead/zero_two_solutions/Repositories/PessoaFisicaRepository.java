package br.senac.ead.zero_two_solutions.Repositories;

import br.senac.ead.zero_two_solutions.Entities.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {
}
