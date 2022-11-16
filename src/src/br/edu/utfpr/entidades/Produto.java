/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.math.BigInteger;

/**
 *
 * @author Vitor Marcante
 */
public class Produto {
    private BigInteger codigo;
    private String descricao;
    private Double valor;
    private Double valor_producao;
    private Double valor_compra;
    private boolean uso_consumo;
    private boolean produzido;
    private boolean ativo;

    public Produto() {
    }

    public Produto(BigInteger codigo, String descricao, Double valor, Double valor_producao, Double valor_compra, boolean uso_consumo, boolean produzido, boolean ativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.valor_producao = valor_producao;
        this.valor_compra = valor_compra;
        this.uso_consumo = uso_consumo;
        this.produzido = produzido;
        this.ativo = ativo;
    }

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
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

    public Double getValor_producao() {
        return valor_producao;
    }

    public void setValor_producao(Double valor_producao) {
        this.valor_producao = valor_producao;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public boolean isUso_consumo() {
        return uso_consumo;
    }

    public void setUso_consumo(boolean uso_consumo) {
        this.uso_consumo = uso_consumo;
    }

    public boolean isProduzido() {
        return produzido;
    }

    public void setProduzido(boolean produzido) {
        this.produzido = produzido;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", valor_producao=" + valor_producao + ", valor_compra=" + valor_compra + ", uso_consumo=" + uso_consumo + ", produzido=" + produzido + ", ativo=" + ativo + '}';
    }
}
