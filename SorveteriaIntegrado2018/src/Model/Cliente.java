/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Cliente {
    public int Codigo;
    public String Nome;
    public String Cpf;
    public String Endereco;
    static public ArrayList<VendaItens> ListaItens = new ArrayList<>();
    public double PrecoFinal;
        
        public ArrayList<VendaItens> getListaItens() {
        return ListaItens;
    }

        public void setListaItens(ArrayList<VendaItens> ListaItens) {
        Cliente.ListaItens = ListaItens;
}
        public double getPrecoFinal() {
        return PrecoFinal;
    }

        public void setPrecoFinal(double PrecoFinal) {
        this.PrecoFinal = PrecoFinal;
    }
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
}
