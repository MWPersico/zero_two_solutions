package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.Professor;
import br.senac.ead.zero_two_solutions.Services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController extends BaseController<Professor, Integer>{
    @Autowired
    public ProfessorController(ProfessorService service){
        super(service);
    }
}
