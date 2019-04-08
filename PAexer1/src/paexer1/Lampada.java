/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer1;

/**
 *
 * @author ANGELO
 */
public class Lampada {
    private int potencia;
    private boolean estado;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
    public void ligar(){
        this.estado = true;   
    }
  
    public void desligar(){
        this.estado = false;   
    }    
    
}
