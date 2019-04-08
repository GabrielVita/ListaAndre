/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer5;

import javax.swing.JOptionPane;

/**
 *
 * @author ANGELO
 */
public class PAexer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor[] motor = new Motor[5];
        int i=0;
        while(i<5){
            motor[i] = new Motor(JOptionPane.showInputDialog("Qual o nome do seu motor?"), Integer.parseInt(JOptionPane.showInputDialog("Qual a potencia do seu motor?")));
            if(i%2==0) motor[i].ligar();
            i++;
        }
        i=0;
        while(i<5){
            JOptionPane.showMessageDialog(null, "Nome: \n" + motor[i].getNome());
            if(!motor[i].isLigado()) JOptionPane.showMessageDialog(null, "Potencia:\n " + motor[i].getPotencia());
            i++;
        }
        
    }
    }
    

