package com.amm.scontrolpac.resources;

import com.amm.scontrolpac.entities.Cliente;
import com.amm.scontrolpac.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResources {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findById(){
        List<Cliente> list = clienteService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{codigo}")
    public ResponseEntity<Cliente> findById(@PathVariable Long codigo){
        Cliente obj = clienteService.findByiD(codigo);
        return ResponseEntity.ok().body(obj);
    }
}
