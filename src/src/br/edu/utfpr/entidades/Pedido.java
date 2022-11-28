/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.time.LocalDate;

/**
 *
 * @author Vitor Marcante
 */
public class Pedido {
    private int id;
    private Cliente cliente_id;
    private LocalDate data_pedido;
    private LocalDate data_entrega;
    private Double valor_pedido;
    private boolean cancelado;
    private String entrega;
    private String status;

    public Pedido() {
    }

    public Pedido(int id, Cliente cliente_id, LocalDate data_pedido, LocalDate data_entrega, Double valor_pedido,
            boolean cancelado, String entrega, String status) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.data_pedido = data_pedido;
        this.data_entrega = data_entrega;
        this.valor_pedido = valor_pedido;
        this.cancelado = cancelado;
        this.entrega = entrega;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente_id=" + cliente_id + ", data_pedido=" + data_pedido
                + ", data_entrega=" + data_entrega + ", valor_pedido=" + valor_pedido + ", cancelado=" + cancelado + ", entrega=" + entrega + ", status=" + status + '}';
    }

}
