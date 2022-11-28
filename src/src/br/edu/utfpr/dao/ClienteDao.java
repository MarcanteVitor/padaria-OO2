/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitor Marcante
 */
public class ClienteDao extends AbstractDaoImpl<Cliente> {

    private PreparedStatement pstm; // insert, update e delete
    private ResultSet rs; // select

    @Override
    public Cliente insert(Cliente cliente) {
        try {
            pstm = getConn().prepareStatement("INSERT INTO carro "
                    + "(nome, cep, rua, numero, logradouro, bairro, ativo, data_cadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            // Statement.RETURN_GENERATED_KEYS permite recuperar as chaves geradas
            // automaticamente por meio do método getGeneratedKeys
            pstm.setString(1, cliente.getNome());
            pstm.setInt(2, cliente.getCep());
            pstm.setString(3, cliente.getRua());
            pstm.setInt(4, cliente.getNumero());
            pstm.setString(5, cliente.getLogradouro());
            pstm.setString(6, cliente.getBairro());
            pstm.setBoolean(7, cliente.isAtivo());
            pstm.setDate(8, Date.valueOf(cliente.getData_cadastro()));
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
    public Cliente update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public Cliente findById(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM cliente");
            rs = pstm.executeQuery();
            return mountList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar lista de clientes, " + ex.getMessage());
            return null;
        }finally{
           super.closePreparedStatement(pstm);
           super.closeResultSet(rs);
        }
    }

    @Override
    public Cliente mount(ResultSet res) {
        try {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCep(rs.getInt("cep"));
            cliente.setRua(rs.getString("rua"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setNumero(rs.getInt("numero"));
            cliente.setLogradouro(rs.getString("logradouro"));
            cliente.setData_cadastro(rs.getDate("datadevolucao").toLocalDate());
            cliente.setAtivo(rs.getBoolean("ativo"));
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Cliente> mountList() {

        List<Cliente> listaCliente = new ArrayList();
        try {
            while (rs.next()) { // enquanto tiver dados do banco
                Cliente cliente = mount(rs);
                listaCliente.add(cliente);
            }
        } catch (SQLException ex) {
        }
        return listaCliente;
    }

    @Override
    public List<Cliente> mountList(ResultSet res) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
