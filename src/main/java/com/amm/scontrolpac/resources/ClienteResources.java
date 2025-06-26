package com.amm.scontrolpac.resources;

import com.amm.scontrolpac.entities.Cliente;
import org.springframework.http.ResponseEntity;

public class ClienteResources {

    public ResponseEntity<Cliente> findById(){
        Cliente c = new Cliente(1L, "12345678901234", "Cliente Teste", "SP", "Contato Teste", "Info Teste", "S");
        return ResponseEntity.ok().body(c);
    }
}
