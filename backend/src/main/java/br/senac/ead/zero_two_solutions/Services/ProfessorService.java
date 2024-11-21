package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.Professor;
import br.senac.ead.zero_two_solutions.Repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService extends BaseService<Professor, Integer>{
    @Autowired
    public ProfessorService(ProfessorRepository repository){
        super(repository);
    }
}
