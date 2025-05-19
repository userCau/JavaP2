package com.projeto.fatec.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidoController {

    @GetMapping("/")
    public String home() {
        return "principal"; // página templates/index.html
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; 
    }
}
