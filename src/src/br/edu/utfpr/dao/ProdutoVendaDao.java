/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Produto;
import br.edu.utfpr.entidades.ProdutoVenda;
import br.edu.utfpr.entidades.Venda;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitor Marcante
 */
public class ProdutoVendaDao extends AbstractDaoImpl<ProdutoVenda> {

    private PreparedStatement pstm; // insert, update e delete
    private ResultSet rs; // select

    /*
     * private int codigo;
     * private Venda venda_id;
     * private Produto produto_id;
     * private Double valor_unitario;
     * private int quantidade;
     * private Double valor_total;
     * private String observacao;
     */

    @Override
    public ProdutoVenda insert(ProdutoVenda produtoVenda) {
        try {
            pstm = getConn().prepareStatement("INSERT INTO produto_pedido "
                    + "(venda_id, produto_id, valor_unitario, quatidade, valor_total, observacao) VALUES (?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            // Statement.RETURN_GENERATED_KEYS permite recuperar as chaves geradas
            // automaticamente por meio do método getGeneratedKeys
            pstm.setInt(1, produtoVenda.getVenda_id().getId());
            pstm.setInt(2, produtoVenda.getProduto_id().getId());
            pstm.setDouble(3, produtoVenda.getValor_unitario());
            pstm.setInt(4, produtoVenda.getQuantidade());
            pstm.setDouble(5, produtoVenda.getValor_total());
            pstm.setString(6, produtoVenda.getObservacao());
            if (pstm.executeUpdate() > 0) { // Executa uma instrução SQL referente a um INSERT, UPDATE e DELETE, o
                                            // retorno é o número de linhas afetadas
                rs = pstm.getGeneratedKeys();// Recupera todas as chaves geradas automaticamente
                rs.next();
                return mount(rs);
            }
            return null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir carro " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public ProdutoVenda update(ProdutoVenda produtoVenda) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public ProdutoVenda findById(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public List<ProdutoVenda> findAll() {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM produto_venda");
            rs = pstm.executeQuery();
            return mountList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar lista de produtos venda, " + ex.getMessage());
            return null;
        }finally{
           super.closePreparedStatement(pstm);
           super.closeResultSet(rs);
        }
    }

    @Override
    public ProdutoVenda mount(ResultSet res) {
        try {
            Produto produto = new Produto();
            Venda venda = new Venda();
            ProdutoVenda produtoVenda = new ProdutoVenda();

            produto.setId(res.getInt("produto_id"));
            venda.setId(res.getInt("venda_id"));
            produtoVenda.setId(rs.getInt("id"));
            produtoVenda.setValor_unitario(rs.getDouble("valor_unitario"));
            produtoVenda.setQuantidade(rs.getInt("quantidade"));
            produtoVenda.setValor_total(rs.getDouble("valor_total"));
            produtoVenda.setObservacao(rs.getString("observacao"));

            return produtoVenda;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoVendaDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        // Tools | Templates.
    }

    public List<ProdutoVenda> mountList() {

        List<ProdutoVenda> listaProdutoVenda = new ArrayList();
        try {
            while (rs.next()) { // enquanto tiver dados do banco
                ProdutoVenda produtoVenda = mount(rs);
                listaProdutoVenda.add(produtoVenda);
            }
        } catch (SQLException ex) {
        }
        return listaProdutoVenda;
    }

    @Override
    public List<ProdutoVenda> mountList(ResultSet res) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
