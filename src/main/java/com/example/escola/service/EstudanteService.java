package com.example.escola.service;

import com.example.escola.models.Estudante;
import com.example.escola.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public Estudante criarEstudante(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> listarEstudante() {
        return estudanteRepository.findAll();
    }

    public Optional<Estudante> buscarEstudantePorId(Long id){
        return estudanteRepository.findById(id);
    }

    public void deletarEstudante(Estudante estudante){
        estudanteRepository.delete(estudante);
    }
    
}
