package com.amm.scontrolpac.config;

import com.amm.scontrolpac.entities.Cliente;
import com.amm.scontrolpac.entities.Contato;
import com.amm.scontrolpac.repositories.ClienteRepository;
import com.amm.scontrolpac.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Scanner;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println(".:: Sistema de Controle Programação, Analista e CLiente ::.");

        System.out.println("Escolha uma opção que está entre parenteses");
        System.out.println("-> (1) Cliente Terminal");
        System.out.println("-> (2) Cadastro de Contato de Cliente");
        System.out.println();
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        if(opcao == 1){
            System.out.println();
            System.out.println("# Cadastro de Cliente");
            sc.nextLine();
            System.out.print("CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.print("Nome do Cliente: ");
            String nome = sc.nextLine();
            System.out.print("UF : ");
            String uf = sc.nextLine();
            System.out.print("Contato do Cliente: ");
            String contato = sc.nextLine();
            System.out.print("Informações Adicionais: ");
            String info = sc.nextLine();
            System.out.print("Ativo?: ");
            String ativo = sc.nextLine();

            Cliente newCliente = new Cliente(null, cnpj, nome, uf, contato, info, ativo);
            clienteRepository.saveAll(Arrays.asList(newCliente));

        } else if (opcao == 2) {
            System.out.println();
            System.out.println("# Cadastro de Contato de Cliente");
            sc.nextLine();
            System.out.print("Codigo do Cliente: ");
            long codcliente = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            System.out.print("Celular: ");
            String celular = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();

            Contato newContato = new Contato(null, codcliente, nome, telefone, celular, email);
            contatoRepository.saveAll(Arrays.asList(newContato));

        } else {
            System.out.println("Opção [" + opcao + "] não existe, rode o programa novamente!!!");
        }

        sc.close();

    }

}

