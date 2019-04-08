/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer4;

/**
 *
 * @author ANGELO
 */
public class Produto {
    private String descricao;
    private double preco;
    private int saldo;
    
    public Produto(){
        
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public Produto(String desc, double p, int s){
        this.descricao=desc;
        this.preco=p;
        this.saldo=s;
    }
}
