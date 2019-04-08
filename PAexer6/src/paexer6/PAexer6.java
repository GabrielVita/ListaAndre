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
public class PAexer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Refrigerante[] refri = new Refrigerante[5];
        int i=0;
        refri[0] = new Refrigerante("Coca Cola", 1.50, 40);
        refri[1] = new Refrigerante("Fanta Uva", 0.90, 10);
        refri[2] = new Refrigerante("Fanta Laranja", 0.90, 8);
        refri[3] = new Refrigerante("Sprite", 0.80, 20);
        refri[4] = new Refrigerante("Kuat", 1.00, 100);
         while(i<5){
            System.out.println((i+1) + " " + refri[i].toString());
            i++;
            }
         int n = Integer.parseInt(JOptionPane.showInputDialog("Qual refrigerante gostaria de comprar?"));
        refri[(n-1)].efetuarVenda(Double.parseDouble(JOptionPane.showInputDialog("Com quantos reais gostaria de pagar?")));
        if(refri[n-1].isVenda()==true){
            JOptionPane.showMessageDialog(null, "Venda efetuada\n Troco: " + refri[n-1].getTroco() );
        } 
        
         JOptionPane.showMessageDialog(null, "\nVenda não realizada");
    }
    
}
