package dev.uevo.CadastroDeNinjas.Missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @GetMapping("/")
    public String boasVindas() { 
        return "Bem-vindo ao Cadastro de Missões!";
    }
}
