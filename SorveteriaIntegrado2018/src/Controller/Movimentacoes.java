/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


/**
 *
 * @author pedro
 */
public class Movimentacoes {
    
    public double CalcTotal(double Preco, double Desconto){
    Preco -= Desconto;
        return Preco;    
    }
    
    public double CalcSubTotal(double Preco,int Quantidade){
        Preco *= Quantidade;
        return Preco;
    }
    
    public double BuscarPreco(int i){
        return Model.VendasTableModel.ListaProdutos.get(i).Preco;
    }
    
    public String BuscarDescricao(int i){
        return Model.VendasTableModel.ListaProdutos.get(i).Descricao;
            
        }
    }
