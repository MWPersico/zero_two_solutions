package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.Aluno;
import br.senac.ead.zero_two_solutions.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService extends BaseService<Aluno, Integer>{
    @Autowired
    public AlunoService(AlunoRepository repository){
        super(repository);
    }
}
