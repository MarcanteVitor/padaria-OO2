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
public class Lancamento {
    private BigInteger codigo;
    private Cliente cliente_id;
    private Pedido pedido_id;
    private Venda venda_id;
    private LocalDate data_lancamento;
    private Double valor;
    private String tipo;
    private char status;

    public Lancamento() {
    }

    public Lancamento(BigInteger codigo, Cliente cliente_id, Pedido pedido_id, Venda venda_id, LocalDate data_lancamento, Double valor, String tipo, char status) {
        this.codigo = codigo;
        this.cliente_id = cliente_id;
        this.pedido_id = pedido_id;
        this.venda_id = venda_id;
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

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }

    public Venda getVenda_id() {
        return venda_id;
    }

    public void setVenda_id(Venda venda_id) {
        this.venda_id = venda_id;
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
        return "Lancamento{" + "codigo=" + codigo + ", cliente_id=" + cliente_id + ", pedido_id=" + pedido_id + ", venda_id=" + venda_id + ", data_lancamento=" + data_lancamento + ", valor=" + valor + ", tipo=" + tipo + ", status=" + status + '}';
    }
}
