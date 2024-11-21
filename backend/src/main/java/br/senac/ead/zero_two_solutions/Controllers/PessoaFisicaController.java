package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.PessoaFisica;
import br.senac.ead.zero_two_solutions.Services.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoaFisica")
public class PessoaFisicaController extends BaseController<PessoaFisica, Integer>{
    @Autowired
    public PessoaFisicaController(PessoaFisicaService service){
        super(service);
    }
}
