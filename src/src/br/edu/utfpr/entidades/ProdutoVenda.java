/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Vitor Marcante
 */
public class ProdutoVenda {
    private int id;
    private Venda venda_id;
    private Produto produto_id;
    private Double valor_unitario;
    private int quantidade;
    private Double valor_total;
    private String observacao;

    public ProdutoVenda() {
    }

    public ProdutoVenda(int id, Venda venda_id, Produto produto_id, Double valor_unitario, int quantidade,
            Double valor_total, String observacao) {
        this.id = id;
        this.venda_id = venda_id;
        this.produto_id = produto_id;
        this.valor_unitario = valor_unitario;
        this.quantidade = quantidade;
        this.valor_total = valor_total;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda_id() {
        return venda_id;
    }

    public void setVenda_id(Venda venda_id) {
        this.venda_id = venda_id;
    }

    public Produto getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Produto produto_id) {
        this.produto_id = produto_id;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "ProdutoVenda{" + "id=" + id + ", venda_id=" + venda_id + ", produto_id=" + produto_id
                + ", valor_unitario=" + valor_unitario + ", quantidade=" + quantidade + ", valor_total=" + valor_total
                + ", observacao=" + observacao + '}';
    }

}
