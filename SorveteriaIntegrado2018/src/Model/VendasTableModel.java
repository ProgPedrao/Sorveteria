/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pedro
 */
public class VendasTableModel extends AbstractTableModel{

    static public ArrayList<VendaItens> ListaProdutos = new ArrayList<VendaItens>();
    private String[] Colunas = {"Código","Descrição","Preço"};

    public VendasTableModel(VendaItens SorvetePote200Ml,VendaItens Sundae, VendaItens Moreninha, VendaItens PicoleDeItu
            ,VendaItens PicoleDeAgua,VendaItens PicoleComCobertura,VendaItens SorveteCone,VendaItens BombomNoPalito) 
    {
        ListaProdutos.removeAll(ListaProdutos);
        ListaProdutos.add(SorvetePote200Ml);
        ListaProdutos.add(Sundae);
        ListaProdutos.add(Moreninha);
        ListaProdutos.add(PicoleDeItu);
        ListaProdutos.add(PicoleDeAgua);
        ListaProdutos.add(PicoleComCobertura);
        ListaProdutos.add(SorveteCone);
        ListaProdutos.add(BombomNoPalito);
    }
    
    
    @Override
    public String getColumnName(int column){
        return Colunas[column];
    }  
    @Override
    public int getRowCount() {
        return ListaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return Colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0:
                return ListaProdutos.get(linha).getCodigo();
            case 1:
                return ListaProdutos.get(linha).getDescricao();
            case 2:
                return ListaProdutos.get(linha).getPreco();
        }
        return null;
    }
    
    public void CarregarListProdutos(VendaItens P){
        VendasTableModel.ListaProdutos.add(P);
        this.fireTableDataChanged();
    }
}