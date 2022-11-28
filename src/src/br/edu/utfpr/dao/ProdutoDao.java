/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Produto;

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
public class ProdutoDao extends AbstractDaoImpl<Produto> {
    private PreparedStatement pstm; // insert, update e delete
    private ResultSet rs; // select

    /*
     * private int codigo;
     * private String descricao;
     * private Double valor;
     * private Double valor_producao_compra;
     * private boolean uso_consumo;
     * private boolean produzido;
     * private boolean ativo;
     * 
     */
    @Override
    public Produto insert(Produto produto) {
        try {
            pstm = getConn().prepareStatement("INSERT INTO produto "
                    + "(descricao, valor, valor_producao_compra, uso_consumo, ativo) VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            // Statement.RETURN_GENERATED_KEYS permite recuperar as chaves geradas
            // automaticamente por meio do método getGeneratedKeys
            pstm.setString(1, produto.getDescricao());
            pstm.setDouble(2, produto.getValor());
            pstm.setDouble(3, 0);
            pstm.setBoolean(4,false);
            pstm.setBoolean(5, produto.isAtivo());
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
    public Produto update(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public Produto findById(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public List<Produto> findAll() {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM produto");
            rs = pstm.executeQuery();
            return mountList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar lista de produtos, " + ex.getMessage());
            return null;
        }finally{
           super.closePreparedStatement(pstm);
           super.closeResultSet(rs);
        }
    }

    @Override
    public Produto mount(ResultSet res) {
        try {
            Produto produto = new Produto();

            produto.setId(rs.getInt("id"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setValor(rs.getDouble("valor"));
            produto.setValor_producao_compra(res.getDouble("valor_producao_compra"));
            produto.setUso_consumo(rs.getBoolean("uso_consumo"));
            produto.setAtivo(rs.getBoolean("ativo"));


            return produto;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Produto> mountList() {

        List<Produto> listaProduto = new ArrayList();
        try {
            while (rs.next()) { // enquanto tiver dados do banco
                Produto produto = mount(rs);
                listaProduto.add(produto);
            }
        } catch (SQLException ex) {
        }
        return listaProduto;
    }

    @Override
    public List<Produto> mountList(ResultSet res) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
