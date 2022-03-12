
package com.algaworks.algafood;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
    
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService AtivacaoClienteService) {
        this.ativacaoClienteService = AtivacaoClienteService;
    }
    
    
    
    @GetMapping("/hello")
    @ResponseBody
    public String Hello(){
        Cliente joao = new Cliente("Joao", "joao@xyz.com", "11 9 3938-8807");
        ativacaoClienteService.ativar(joao);
        
        return "Olá Mundo";
    }
}
