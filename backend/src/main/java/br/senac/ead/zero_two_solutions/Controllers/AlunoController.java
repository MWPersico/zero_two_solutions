package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.Aluno;
import br.senac.ead.zero_two_solutions.Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController extends BaseController<Aluno, Integer>{
    @Autowired
    public AlunoController(AlunoService service){
        super(service);
    }
}
