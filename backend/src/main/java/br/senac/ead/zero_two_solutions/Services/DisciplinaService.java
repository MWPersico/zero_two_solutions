package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.Disciplina;
import br.senac.ead.zero_two_solutions.Repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService extends BaseService<Disciplina, Integer>{
    @Autowired
    public DisciplinaService(DisciplinaRepository repository){
        super(repository);
    }
}
