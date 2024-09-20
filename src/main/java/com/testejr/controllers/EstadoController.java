package com.testejr.controllers;

import com.testejr.entities.Estado;
import com.testejr.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> findAll(){
        List<Estado> result = estadoService.findAll();
        return result;
    }
    @GetMapping(value ="/{id}")
    public Estado findById( @PathVariable Long id){
        Estado estado = estadoService.findById(id);
        return estado;
    }

}

