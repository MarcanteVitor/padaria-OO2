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
public class Receita {
    private BigInteger codigo;
    private Lancamento lancamento;
    private LocalDate data_lancamento;
    private Double valor;
    private String tipo;
    private char status;

    public Receita() {
    }

    public Receita(BigInteger codigo, Lancamento lancamento, LocalDate data_lancamento, Double valor, String tipo, char status) {
        this.codigo = codigo;
        this.lancamento = lancamento;
        this.data_lancamento = data_lancamento;
        this.valor = valor;
        this.tipo = tipo;
        this.status = status;
    }

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }

    public Lancamento getLancamento() {
        return lancamento;
    }

    public void setLancamento(Lancamento lancamento) {
        this.lancamento = lancamento;
    }

    public LocalDate getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDate data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Recebimento{" + "codigo=" + codigo + ", lancamento=" + lancamento + ", data_lancamento=" + data_lancamento + ", valor=" + valor + ", tipo=" + tipo + ", status=" + status + '}';
    }
    
    
    
}
