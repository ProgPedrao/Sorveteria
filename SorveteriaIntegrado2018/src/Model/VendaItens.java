/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pedro
 */
public class VendaItens extends Produtos{
    public int QtdProdutos;
    public double Total;

    public int getQtdProdutos() {
        return QtdProdutos;
    }

    public void setQtdProdutos(int QtdProdutos) {
        this.QtdProdutos = QtdProdutos;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
}
