/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paexer7;

/**
 *
 * @author aluno
 */
public class Empresa {
    private String nome;
    private double capital;
    private int numFuncionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    
    

    public Empresa(String nome, double capital, int numFuncionario) {
        this.nome = nome;
        this.capital = capital;
        this.numFuncionario = numFuncionario;
    }
}
