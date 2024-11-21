package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.Curso;
import br.senac.ead.zero_two_solutions.Repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService extends BaseService<Curso, Integer>{
    @Autowired
    public CursoService(CursoRepository repository){
        super(repository);
    }
}
