package com.testejr.services;

import com.testejr.entities.Cliente;
import com.testejr.entities.Estado;
import com.testejr.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        List<Cliente> result = clienteRepository.findAll();
        return result;
    }

    public Cliente findById(Long id) {
        Optional<Cliente> result = clienteRepository.findById(id);
        Cliente cliente = result.get();
        return cliente;
    }

    @Transactional
    public Cliente insert (Cliente cliente){

        Cliente entity = new Cliente();
        entity.setNome(cliente.getNome());
        entity.setCidade(cliente.getCidade());
        entity.setCep(cliente.getCep());

        Estado estado = new Estado();
        estado.setId(cliente.getEstado().getId());

        entity.setEstado(estado);
        entity=clienteRepository.save(entity);

        return new Cliente(entity);
    }

    @Transactional
    public Cliente update (Long id,Cliente cliente){

        Cliente entity = clienteRepository.getReferenceById(id);
        entity.setNome(cliente.getNome());
        entity.setCidade(cliente.getCidade());
        entity.setCep(cliente.getCep());

        Estado estado = new Estado();
        estado.setId(cliente.getEstado().getId());

        entity.setEstado(estado);
        entity=clienteRepository.save(entity);

        return new Cliente(entity);
    }
    @Transactional
    public void delete (Long id) {
        clienteRepository.deleteById(id);
    }


}
