/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer10;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PAexer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nomesAl = new ArrayList<>();
        ArrayList<Float> notasAl = new ArrayList<>();
        int i=0;
        while(i<10){
            nomesAl.add((JOptionPane.showInputDialog("Nome do aluno")));
            notasAl.add(Float.parseFloat(JOptionPane.showInputDialog("Notas")));
            i++;
        }
        Turma turminha = new Turma(nomesAl, notasAl);
        System.out.println("\n Media: " + turminha.calcularMediaNota());
        turminha.imprimirAlunos();

    }
    
}
