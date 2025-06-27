package com.amm.scontrolpac.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private Long codcliente;
    private String nome;
    private String telefone;
    private String celular;
    private String email;

    @ManyToOne
    private Cliente clienteCont;

    public Contato(){
    }

    public Contato(Long codigo, Long codcliente, String nome, String telefone, String celular, String email) {
        super();
        this.codigo = codigo;
        this.codcliente = codcliente;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Long codcliente) {
        this.codcliente = codcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getCodigo(), contato.getCodigo()) && Objects.equals(getCodcliente(), contato.getCodcliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getCodcliente());
    }
}
