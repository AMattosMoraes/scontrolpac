package com.amm.scontrolpac.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String cnpj;
    private String nome;
    private String uf;
    private String contato;
    private String info;
    private String ativo;

    public Cliente(){}

    public Cliente(Long codigo, String cnpj, String nome, String uf, String contato, String info, String ativo) {
        super();
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.nome = nome;
        this.uf = uf;
        this.contato = contato;
        this.info = info;
        this.ativo = ativo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getCodigo(), cliente.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }
}
