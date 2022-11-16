/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Vitor Marcante
 */
public class ProdutoComposicao {
    private Produto produto;
    private Double valor_unitario;
    private Double quantidade;
    private Double valor_total;
    private String observacao;

    public ProdutoComposicao() {
    }

    public ProdutoComposicao(Produto produto, Double valor_unitario, Double quantidade, Double valor_total, String observacao) {
        this.produto = produto;
        this.valor_unitario = valor_unitario;
        this.quantidade = quantidade;
        this.valor_total = valor_total;
        this.observacao = observacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
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
        return "ProdutoComposicao{" + "produto=" + produto + ", valor_unitario=" + valor_unitario + ", quantidade=" + quantidade + ", valor_total=" + valor_total + ", observacao=" + observacao + '}';
    }
    
    
}
