package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.PessoaFisica;
import br.senac.ead.zero_two_solutions.Repositories.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaFisicaService extends BaseService<PessoaFisica, Integer>{
    @Autowired
    public PessoaFisicaService(PessoaFisicaRepository repository){
        super(repository);
    }
}
