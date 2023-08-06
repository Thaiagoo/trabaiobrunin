/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gitproject;

public class project {
        
    public class Operacoes {

    public double divisao(double a,
                        double b) {
        if(a != 0){
            double quociente = a / b;
            return quociente;
        }
        return 0;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double soma(double x, double y) {
        return x + y;
    }

    public double subtracao(double x, double y) {
        x -= y;
        return x;
    }

    public int restoDivisao(int divisor, int dividendo) {
        int resto = divisor % dividendo;
        return resto;
    }

    public int proximoNumero(int n){
        return n++; 
    }
    
    public int anteriorNumero(int n){
        return n--; 
    }
    System.out.println("Deu certo!");
}
        

