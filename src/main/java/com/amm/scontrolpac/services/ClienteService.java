package com.amm.scontrolpac.services;

import com.amm.scontrolpac.entities.Cliente;
import com.amm.scontrolpac.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findByiD(Long codigo){
        Optional<Cliente> obj = clienteRepository.findById(codigo);
        return obj.get();
    }
}
