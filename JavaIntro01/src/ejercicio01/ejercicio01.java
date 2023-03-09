/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author MartinExo
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        int resultado;
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese un numero entero");
        num2 = leer.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es " + resultado);
        
    }
    
}
