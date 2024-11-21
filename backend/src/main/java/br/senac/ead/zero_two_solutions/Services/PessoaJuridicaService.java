package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.PessoaJuridica;
import br.senac.ead.zero_two_solutions.Repositories.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaJuridicaService extends BaseService<PessoaJuridica, Integer>{
    @Autowired
    public PessoaJuridicaService(PessoaJuridicaRepository repository){
        super(repository);
    }
}
