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
public class Venda {
    private int id;
    private Cliente cliente_id;
    private Pedido pedido_id;
    private LocalDate data_venda;
    private Double valor_pago;
    private Double valor_venda;
    private Double valor_troco;
    private Boolean cancelado;
    private String entrega;

    public Venda() {
    }

    public Venda(int id, Cliente cliente_id, Pedido pedido_id, LocalDate data_venda, Double valor_pago,
            Double valor_venda, Double valor_troco, Boolean cancelado, String entrega) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.pedido_id = pedido_id;
        this.data_venda = data_venda;
        this.valor_pago = valor_pago;
        this.valor_venda = valor_venda;
        this.valor_troco = valor_troco;
        this.cancelado = cancelado;
        this.entrega = entrega;
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

    public Pedido getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(Pedido pedido_id) {
        this.pedido_id = pedido_id;
    }

    public LocalDate getData_venda() {
        return data_venda;
    }

    public void setData_venda(LocalDate data_venda) {
        this.data_venda = data_venda;
    }

    public Double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(Double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Double getValor_troco() {
        return valor_troco;
    }

    public void setValor_troco(Double valor_troco) {
        this.valor_troco = valor_troco;
    }

    public Boolean getCancelado() {
        return cancelado;
    }

    public void setCancelado(Boolean cancelado) {
        this.cancelado = cancelado;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente_id=" + cliente_id + ", pedido_id=" + pedido_id
                + ", data_venda=" + data_venda + ", valor_pago=" + valor_pago + ", valor_venda=" + valor_venda
                + ", valor_troco=" + valor_troco + ", cancelado=" + cancelado + ", entrega=" + entrega + '}';
    }

}
