package dev.uevo.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController{
    @GetMapping("/")
    public String boasVindas() {
        return "Bem-vindo ao Cadastro de Ninjas!";
    }
}
