package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.Disciplina;
import br.senac.ead.zero_two_solutions.Services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController extends BaseController<Disciplina, Integer>{
    @Autowired
    public DisciplinaController(DisciplinaService service){
        super(service);
    }
}
