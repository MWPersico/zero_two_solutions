package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.PessoaJuridica;
import br.senac.ead.zero_two_solutions.Services.PessoaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoaJuridica")
public class PessoaJuridicaController extends BaseController<PessoaJuridica, Integer>{
    @Autowired
    public PessoaJuridicaController(PessoaJuridicaService service){
        super(service);
    }
}
