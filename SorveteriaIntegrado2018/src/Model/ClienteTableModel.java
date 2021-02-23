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
public class ClienteTableModel extends AbstractTableModel{

    static public ArrayList<Cliente> ListaClientes = new ArrayList<>();

    private String[] Colunas = {"Código","Nome","CPF","Endereço"};

    
    @Override
    public String getColumnName(int column) {
        return Colunas[column];
    }
    
    
    @Override
    public int getRowCount() {
        return ListaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return Colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return ListaClientes.get(linha).getCodigo();
            case 1:
                return ListaClientes.get(linha).getNome();
            case 2:
                return ListaClientes.get(linha).getCpf();
            case 3:
                return ListaClientes.get(linha).getEndereco();
        }
        
        return null;
    }
    
    public void CarregarLista(Cliente C){
        ClienteTableModel.ListaClientes.add(C);
        this.fireTableDataChanged();
    }
    public void RemoverdaLista(int i){
        ClienteTableModel.ListaClientes.remove(i);
        this.fireTableDataChanged();
    }
    public ArrayList ResultadoDaLista(){
        return ClienteTableModel.ListaClientes;
    } 
}
