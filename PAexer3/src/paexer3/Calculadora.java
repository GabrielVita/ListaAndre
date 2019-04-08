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
public class Calculadora {
    private double result1;
    private double result2;
    private double result3;
    private double result4;

    public double getResult1() {
        return result1;
    }

    public void setResult1(double result1) {
        this.result1 = result1;
    }

    public double getResult2() {
        return result2;
    }

    public void setResult2(double result2) {
        this.result2 = result2;
    }

    public double getResult3() {
        return result3;
    }

    public void setResult3(double result3) {
        this.result3 = result3;
    }

    public double getResult4() {
        return result4;
    }

    public void setResult4(double result4) {
        this.result4 = result4;
    }
    public double somar(double a, double b){
        this.result1= a + b;
        return result1;
    }
    public double subtrair(double a, double b){
        this.result2 = a - b;
        return result2;
    }
    public double multiplicar(double a, double b){
        this.result3 = a * b;
        return result3;
    }
    public double dividir(double a, double b){
        if(b!=0){
        this.result4 = a / b;    
        }else{
            System.out.println("Operação não realizada");
        }
        
        return result4;
    }
}
