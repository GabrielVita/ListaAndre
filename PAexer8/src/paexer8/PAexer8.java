/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PAexer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Livro livro;
        int i=1;
        while(livros.size()<4){
            livro = new Livro(JOptionPane.showInputDialog(null,"Informe o nome do livro"), Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas pag tem o livro")));
            livros.add(livro);
            i++;
        }
        i=0;
        while(i<livros.size()){
            System.out.println(livros.get(i));
            i++;
        } 
    }
    
}
