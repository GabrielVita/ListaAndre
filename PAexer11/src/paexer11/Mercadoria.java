/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer11;

/**
 *
 * @author Guilherme
 */
public class Mercadoria {
    private String nome;
    private double custo;
    private int Estoque;
    
   public double comprar(){
       this.Estoque--;
       return this.custo;
   }
    public double comprar(int qtd){
       this.Estoque -= qtd;
       return (this.custo*qtd);
   }
    public double comprar(int qtd, int desc){
        double valorCompra = this.custo * qtd;
        double valorDesconto = ((valorCompra * desc)/100);
       
       this.Estoque -= qtd;
       return (valorCompra - valorDesconto);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double valor) {
        this.custo = valor;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int qtdEstoque) {
        this.Estoque = qtdEstoque;
    }

    public Mercadoria(String nome, double valor, int qtdEstoque) {
        this.nome = nome;
        this.custo = valor;
        this.Estoque = qtdEstoque;
    }
    
    
}
