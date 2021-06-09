package br.com.devinhouse.exerciciossegurancaspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicios")
public class ExerciciosController {

	@GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Bem vindo aos nossos exercicios sobre Autorização e Autenticação de uma aplicação Client");
    }
    
}
