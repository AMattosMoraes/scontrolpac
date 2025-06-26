package com.amm.scontrolpac.config;

import com.amm.scontrolpac.entities.Cliente;
import com.amm.scontrolpac.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
//        Cliente newCliente = new Cliente(null, "12345678901234", "Cliente Teste", "SP", "Contato Teste", "Info Teste", "S");
//        clienteRepository.saveAll(Arrays.asList(newCliente));
    }
}

