/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1calculadora;

/**
 *
 * @author PC1
 */
public class Practica1Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=3;
        int b=2;
        int c=0;
        
        Calculadora cal = new Calculadora();
        cal.Suma(a, b);
        cal.Resta(a, b);
        System.out.println(cal.Resta(a, b));
        
        Calculadora cal1 = new Calculadora(a, b);
        cal1.Suma();
        cal1.Resta();
        System.out.println(cal1.Resta());
        
        /*c=a+b;
        System.out.print(c);*/
        
        
        
        }
    
}
