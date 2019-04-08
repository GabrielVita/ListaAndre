/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer2;

/**
 *
 * @author ANGELO
 */
public class Conta {
    private String nome;
    private int numconta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositarValor(int valor){
        this.saldo=this.saldo+valor;
    }
    public boolean retirarValor(int valor){
        if(valor<=saldo){
            this.saldo=this.saldo-valor;
            return true;
        }else{
            return false;
        }
    }
    public double consultaSaldo(){
        return saldo;
    }
    public Conta(String n, int nconta, double s){
        this.nome = n;
        this.numconta = nconta;
        this.saldo = s;
    }
}
