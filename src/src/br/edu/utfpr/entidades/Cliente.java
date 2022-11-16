/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.math.BigInteger;
import java.time.LocalDate;

/**
 *
 * @author Vitor Marcante
 */
public class Cliente {
    private String nome;
    private BigInteger cep;
    private String rua;
    private int numero;
    private String logradouro;
    private String bairro;
    private boolean ativo;
    private LocalDate data_cadastro;

    public Cliente() {
    }

    public Cliente(String nome, BigInteger cep, String rua, int numero, String logradouro, String bairro, boolean ativo,
            LocalDate data_cadastro) {
        this.nome = nome;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.ativo = ativo;
        this.data_cadastro = data_cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getCep() {
        return cep;
    }

    public void setCep(BigInteger cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", logradouro="
                + logradouro + ", bairro=" + bairro + ", ativo=" + ativo + ", data_cadastro=" + data_cadastro + '}';
    }

}
