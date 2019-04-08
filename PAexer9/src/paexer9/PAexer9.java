/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer9;

/**
 *
 * @author aluno
 */
public class PAexer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        
        pessoas[0] = new Pessoa("Miguel" , 13, 1.7, 55, "Masculino");
        System.out.println(pessoas[0]);
        
        pessoas[1] = new Pessoa("Gabriel" , 18, 2.0, 80, "Masculino");
        System.out.println(pessoas[1]);  
        
        pessoas[2] = new Pessoa("Thamiro" , 18, 1.45, 45, "Feminino");
        System.out.println(pessoas[2]); 
        
        pessoas[3] = new Pessoa("Waldyr" , 19, 1.67, 65, "Masculino");
        System.out.println(pessoas[3]);
    }
    
}
