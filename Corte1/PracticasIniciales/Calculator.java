//Dos decimas de evaluacion de primer corte
package calculator;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
    
}
    
    public int add(int a, int b){
        return a+b;
    }
    
    public int substract(int a, int b){
        return a-b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
    
    public double divide(int a, int b){
        return a/b;
    }
    
    public int module(int a, int b){
        return a%b;
    }
    
    public static void main(String[] args){
        Scanner digito = new Scanner(System.in);
        
        System.out.print("Escriba el primer digito: ");
        int D1 = digito.nextInt();
        
        System.out.print("Escriba el segundo digito: ");
        int D2 = digito.nextInt();
        
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(D1,D2));
        System.out.println(myCalculator.substract(D1,D2));
        System.out.println(myCalculator.multiply(D1, D2)); 
    }
    
}

