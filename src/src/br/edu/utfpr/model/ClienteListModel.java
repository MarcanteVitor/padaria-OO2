/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model;

import br.edu.utfpr.entidades.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ClienteListModel extends AbstractTableModel {

    private List<Cliente> listaCliente;

    private String[] colunas = new String[] { "Id", "Nome", "CEP", "Rua", "Numero", "Logradouro", "Bairro", "Ativo" };

    public ClienteListModel(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public int getRowCount() {
        return listaCliente.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Cliente cliente = listaCliente.get(row);
        switch (column) {
            case 0:
                return cliente.getId();
            case 1:
                return cliente.getNome();
            case 2:
                return cliente.getCep();
            case 3:
                return cliente.getRua();
            case 4:
                return cliente.getNumero();
            case 5:
                return cliente.getLogradouro();
            case 6:
                return cliente.getBairro();
            case 7:
                return cliente.isAtivo();
            default:
                break;
        }
        return cliente;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Cliente cliente) {
        listaCliente.add(cliente);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaCliente.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Cliente cliente) {
        listaCliente.set(indiceLinha, cliente);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }

}
