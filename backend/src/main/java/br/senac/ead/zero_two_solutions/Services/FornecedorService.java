package br.senac.ead.zero_two_solutions.Services;

import br.senac.ead.zero_two_solutions.Entities.Fornecedor;
import br.senac.ead.zero_two_solutions.Repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService extends BaseService<Fornecedor, Integer>{
    @Autowired
    public FornecedorService(FornecedorRepository repository){
        super(repository);
    }
}
