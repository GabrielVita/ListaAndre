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
public class ContaEspecial extends Conta {
    private double limite;

    public double getLimete() {
        return limite;
    }

    public void setLimete(double limete) {
        this.limite = limete;
    }
    public ContaEspecial(String n,int nconta, double s, double limite){
        super(n,nconta,s);
        this.limite =limite;
        
    }
    @Override
    public double consultaSaldo(){
        return (this.getSaldo() + this.limite);
    }
   @Override
    public boolean retirarValor(int valor){
        if(valor<=this.getSaldo()+limite){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }else{
            return false;
        }
    }
    
}
