/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer6;

import javax.swing.JOptionPane;

/**
 *
 * @author ANGELO
 */
public class Refrigerante {
    private String nome;
    private double preco;
    private int qtdEstoque;
    private boolean venda;
    private double troco;
    
    public Refrigerante(String n, double p, int  q){
        this.nome = n;
        this.preco = p;
        this.qtdEstoque = q;
    }
    public boolean efetuarVenda (double pagamento){
        if(this.qtdEstoque>0){
            this.qtdEstoque = this.qtdEstoque - 1;
            this.troco=pagamento-this.preco;
            return  this.venda=true;
        }
        return this.venda=false;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public boolean isVenda() {
        return venda;
    }

    public void setVenda(boolean venda) {
        this.venda = venda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
