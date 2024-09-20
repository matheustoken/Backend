package com.testejr.controllers;

import com.testejr.entities.Cliente;
import com.testejr.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value ="/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente> result = clienteService.findAll();
        return result;
    }
    @GetMapping(value ="/{id}")
    public Cliente findById( @PathVariable Long id){
        Cliente cliente = clienteService.findById(id);
        return cliente;
    }
    @PostMapping
    public ResponseEntity<Cliente> insert(@RequestBody Cliente cliente){
        cliente = clienteService.insert(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).body(cliente);
    }
    @PutMapping(value ="/{id}")
    public Cliente update( @PathVariable Long id,@RequestBody Cliente cliente){
        cliente = clienteService.update(id,cliente);
        return cliente;
    }
    @DeleteMapping(value ="/{id}")
    public ResponseEntity<Void> delete( @PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
