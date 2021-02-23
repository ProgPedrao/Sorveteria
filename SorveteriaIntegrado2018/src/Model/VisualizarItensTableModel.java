/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pedro
 */
public class VisualizarItensTableModel extends AbstractTableModel{

    private String[] Colunas = {"Codigo","Descrição","Preço R$","Quantidade","desconto R$","total R$"};
    
    @Override
    public String getColumnName (int Column){
        return Colunas[Column];
    }
    
    @Override
    public int getRowCount() {
        return View.TelaVendas.ListaProdVendidos.size();
    }

    @Override
    public int getColumnCount() {
        return Colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0 :
                return View.TelaVendas.ListaProdVendidos.get(linha).getCodigo();
            case 1:
                return View.TelaVendas.ListaProdVendidos.get(linha).getDescricao();
            case 2:
                return View.TelaVendas.ListaProdVendidos.get(linha).getPreco();
            case 3:
                return View.TelaVendas.ListaProdVendidos.get(linha).getQtdProdutos();
            case 4:
                return ((View.TelaVendas.ListaProdVendidos.get(linha).getPreco()*View.TelaVendas.ListaProdVendidos.get(linha).getQtdProdutos())-View.TelaVendas.ListaProdVendidos.get(linha).getTotal());
            case 5:
                return View.TelaVendas.ListaProdVendidos.get(linha).getTotal();
        }
        return null;
    }
    
    public void CarregarList(VendaItens c){
        View.TelaVendas.ListaProdVendidos.add(c);
        this.fireTableDataChanged();
    }
    public void RemoverList(int i){
        View.TelaVendas.ListaProdVendidos.remove(i);
        this.fireTableDataChanged();
    }
}
