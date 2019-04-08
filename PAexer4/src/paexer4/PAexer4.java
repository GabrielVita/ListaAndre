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
public class PAexer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto[] produto = new Produto[5];
        int i=0;
        while(i<5){
            produto[i] = new Produto();
            i++;
        }
        produto[0].setDescricao("Caneta");
        produto[0].setPreco(5.00);
        produto[0].setSaldo(100);
        
        produto[1].setDescricao("Lápis");
        produto[1].setPreco(1.50);
        produto[1].setSaldo(100);
        
        produto[2].setDescricao("Corretivo");
        produto[2].setPreco(4.50);
        produto[2].setSaldo(100);
        
        produto[3].setDescricao("Lapisera");
        produto[3].setPreco(3.00);
        produto[3].setSaldo(100);
        
        produto[4].setDescricao("Borracha");
        produto[4].setPreco(2.50);
        produto[4].setSaldo(100);
        
    }
    
}
