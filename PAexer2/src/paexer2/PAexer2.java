/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer2;

/**
 *
 * @author ANGELO
 */
public class PAexer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta("Gabriel Vita",1234,10000);
        conta.depositarValor(150);
        conta.retirarValor(40);
        System.out.println("R$"+conta.consultaSaldo());
        ContaEspecial conta2 = new ContaEspecial("Joã0", 1234,100,500);
        conta2.depositarValor(400);
        conta2.retirarValor(50);
        System.out.println("R$"+conta2.consultaSaldo());
        conta2.retirarValor(900);
        System.out.println("R$"+conta2.consultaSaldo());
        conta2.retirarValor(100);
        conta2.depositarValor(50);
        System.out.println("R$"+conta2.consultaSaldo());
        conta2.retirarValor(100);
        System.out.println("R$"+conta2.consultaSaldo());
    }
    
}
