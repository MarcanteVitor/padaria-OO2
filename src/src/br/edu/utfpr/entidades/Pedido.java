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
public class Pedido {
    private BigInteger codigo;
    private Cliente cliente_id;
    private LocalDate data_pedido;
    private LocalDate data_entrega;
    private Double valor_pedido;
    private double valor_adiantamento;
    private boolean cancelado;
    private char entrega;
    private char status;

    public Pedido() {
    }

    public Pedido(BigInteger codigo, Cliente cliente_id, LocalDate data_pedido, LocalDate data_entrega, Double valor_pedido, double valor_adiantamento, boolean cancelado, char entrega, char status) {
        this.codigo = codigo;
        this.cliente_id = cliente_id;
        this.data_pedido = data_pedido;
        this.data_entrega = data_entrega;
        this.valor_pedido = valor_pedido;
        this.valor_adiantamento = valor_adiantamento;
        this.cancelado = cancelado;
        this.entrega = entrega;
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

    public LocalDate getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(LocalDate data_pedido) {
        this.data_pedido = data_pedido;
    }

    public LocalDate getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(LocalDate data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Double getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(Double valor_pedido) {
        this.valor_pedido = valor_pedido;
    }

    public double getValor_adiantamento() {
        return valor_adiantamento;
    }

    public void setValor_adiantamento(double valor_adiantamento) {
        this.valor_adiantamento = valor_adiantamento;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public char getEntrega() {
        return entrega;
    }

    public void setEntrega(char entrega) {
        this.entrega = entrega;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", cliente_id=" + cliente_id + ", data_pedido=" + data_pedido + ", data_entrega=" + data_entrega + ", valor_pedido=" + valor_pedido + ", valor_adiantamento=" + valor_adiantamento + ", cancelado=" + cancelado + ", entrega=" + entrega + ", status=" + status + '}';
    }
   
    
}
