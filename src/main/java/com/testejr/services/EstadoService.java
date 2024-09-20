package com.testejr.services;

import com.testejr.entities.Estado;
import com.testejr.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll(){
        List<Estado> result = estadoRepository.findAll();
        return result;
    }

    public Estado findById(Long id){
        Optional<Estado> result = estadoRepository.findById(id);
        Estado estado = result.get();
        return estado;
    }


}
