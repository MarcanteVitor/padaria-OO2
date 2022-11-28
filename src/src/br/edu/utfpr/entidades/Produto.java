/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Vitor Marcante
 */
public class Produto {
    private int id;
    private String descricao;
    private Double valor;
    private Double valor_producao_compra;
    private boolean uso_consumo;
    private boolean ativo;

    public Produto() {
    }

    public Produto(int id, String descricao, Double valor, Double valor_producao_compra, boolean uso_consumo, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.valor_producao_compra = valor_producao_compra;
        this.uso_consumo = uso_consumo;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor_producao_compra() {
        return valor_producao_compra;
    }

    public void setValor_producao_compra(Double valor_producao_compra) {
        this.valor_producao_compra = valor_producao_compra;
    }

    public boolean isUso_consumo() {
        return uso_consumo;
    }

    public void setUso_consumo(boolean uso_consumo) {
        this.uso_consumo = uso_consumo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor
                + ", valor_producao_compra="
                + valor_producao_compra + ", uso_consumo=" + uso_consumo + ", ativo=" + ativo + '}';
    }
}
