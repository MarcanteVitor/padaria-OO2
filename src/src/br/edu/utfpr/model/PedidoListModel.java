/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.edu.utfpr.entidades.Pedido;

/**
 *
 * @author Vitor Marcante
 */
public class PedidoListModel extends AbstractTableModel{
    private List<Pedido> listaPedido;

    private String[] colunas = new String[] { "Id", "Cliente", "Data Pedido", "Data Entrega", "Valor", "Cancelado", "Entrega" , "Status"};

    public PedidoListModel(List<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    @Override
    public int getRowCount() {
        return listaPedido.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Pedido pedido = listaPedido.get(row);
        switch (column) {
            case 0:
                return pedido.getId();
            case 1:
                return pedido.getCliente_id();
            case 2:
                return pedido.getData_pedido();
            case 3:
                return pedido.getData_entrega();
            case 4:
                return pedido.getValor_pedido();
            case 5:
                return pedido.isCancelado();
            case 6:
                return pedido.getEntrega();
            case 7:
                return pedido.getStatus();
            default:
                break;
        }
        return pedido;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Pedido pedido) {
        listaPedido.add(pedido);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaPedido.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Pedido pedido) {
        listaPedido.set(indiceLinha, pedido);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
}
