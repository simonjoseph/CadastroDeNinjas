package dev.uevo.CadastroDeNinjas.Missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @GetMapping
    public String index() { 
        return "Bem-vindo ao Cadastro de Missões!";
    }
}
