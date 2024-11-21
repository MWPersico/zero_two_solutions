package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.Curso;
import br.senac.ead.zero_two_solutions.Services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/curso")
public class CursoController extends BaseController<Curso, Integer>{
    @Autowired
    public CursoController(CursoService service){
        super(service);
    }
}
