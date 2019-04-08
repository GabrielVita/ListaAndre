/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer3;

/**
 *
 * @author ANGELO
 */
public class PAexer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Calculadora cal = new Calculadora();
      cal.somar(2, 3);
      cal.subtrair(2, 3);
      cal.multiplicar(2, 3);
      cal.dividir(2, 3);
      System.out.println("Resultados:\n" + cal.getResult1() + "\n" + cal.getResult2() + "\n" + cal.getResult3() + "\n" + cal.getResult4());
      
    }
    
}
