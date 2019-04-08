/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer7;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PAexer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Empresa[] empresas = new Empresa[5];
        
       empresas[0] = new Empresa("Mc Donalds", 300, 10);
       empresas[1] = new Empresa("BK", 500, 15);
       empresas[2] = new Empresa("Bobs", 100, 40);
       empresas[3] = new Empresa("Red", 250, 25);
       empresas[4] = new Empresa("Bravo", 750, 50);
       
       int maior=0;
       int i=0, ind=0;
       while(i<5){
           
           if(empresas[i].getNumFuncionario() > maior){
               maior = empresas[i].getNumFuncionario();
               ind = i;
           }
           i++;
       }
       
        JOptionPane.showMessageDialog(null, "Dados da Empresa:\n " + empresas[ind].getNome() + " \nÉ a que tem mais funcionarios");
       
    }
    
}
