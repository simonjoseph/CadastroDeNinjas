package dev.uevo.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

import dev.uevo.CadastroDeNinjas.Ninjas.Services.NinjaService;

@RestController
@RequestMapping
public class NinjaController{

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/")
    public String index() {
        return "Bem-vindo ao Cadastro de Ninjas!=";
    }
}
