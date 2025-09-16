package com.example.escola.controller;

import com.example.escola.models.Estudante;
import com.example.escola.repository.EstudanteRepository;
import com.example.escola.service.EstudanteService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping


public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public Estudante criar(@RequestBody Estudante estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @GetMapping
    public List<Estudante> listarEstudantePorNome(String nome){
        return estudanteService.listarEstudante();
    }
    
}
