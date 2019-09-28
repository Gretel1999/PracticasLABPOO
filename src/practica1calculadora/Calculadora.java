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
public class Calculadora {
    private int a;
    private int b;
    
    public Calculadora(){
    }
    
    public Calculadora(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    public void Suma(int a, int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
    public int Resta(int a, int b)
    {
        int c;
        c=a-b;
        return c;
    }
     public void Suma()
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
    public int Resta()
    {
        int c;
        c=a-b;
        return c;
    }
    }
