package br.senac.ead.zero_two_solutions.Controllers;

import br.senac.ead.zero_two_solutions.Entities.Fornecedor;
import br.senac.ead.zero_two_solutions.Services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController extends BaseController<Fornecedor, Integer>{
    @Autowired
    public FornecedorController(FornecedorService service){
        super(service);
    }
}
