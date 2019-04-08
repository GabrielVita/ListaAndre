/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer10;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Turma {
    ArrayList<String> nomesAl;
    ArrayList<Float> notasAl;
    
    
    public double calcularMediaNota(){
        int i=0;
        double media=0;
        while(i<notasAl.size()){
            media+=notasAl.get(i);
            i++;
        }
        return (media/notasAl.size());
    }
    
    public void imprimirAlunos(){
        int i=0;
        while(i<nomesAl.size()){
            System.out.println("\n" + nomesAl.get(i) + "_________" + notasAl.get(i));
            i++;
        }
    }
    
    

    public Turma() {
        this.nomesAl = new ArrayList<>();
        this.notasAl = new ArrayList<>();
    }

    public Turma(ArrayList<String> nomeAlunos, ArrayList<Float> notasAlunos) {
        this.nomesAl = nomeAlunos;
        this.notasAl = notasAlunos;
    }
    
    
    
}
