/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer1;

import javax.swing.JOptionPane;

/**
 *
 * @author ANGELO
 */
public class PAexer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.desligar();
        lampada.setPotencia(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe quantos watts tem a lampada?")));
        if(JOptionPane.showConfirmDialog(null,"Deseja ligar a lâmpada?\n")==0){
            lampada.ligar();
        }else{
            
        }
        if(lampada.isEstado()==true){
         JOptionPane.showMessageDialog(null, "Dados da lâmpada\n\nPotencia:\n" + lampada.getPotencia() + "w\n" + "Lampada está ligada" );
       
        }else{
            JOptionPane.showMessageDialog(null, "Dados da lâmpada\n\nPotencia:\n" + lampada.getPotencia() + "w\n" + "Lampada está desligada"  );
    
        }
        }      
    }
    
