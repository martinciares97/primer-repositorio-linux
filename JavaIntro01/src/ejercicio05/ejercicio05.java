/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author MartinExo
 */
public class ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int num_x2;
        int num_x3;
        double num_raiz;
        
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
        num_x2 = numero * 2;
        num_x3 = numero * 3;
        num_raiz = Math.sqrt(numero);
        
        System.out.println("Numero ingresado: " + numero + 
                " - El doble: " + num_x2 +
                " - El triple: " + num_x3 +
                " - La raiz cuadrada: " + num_raiz);
        
    }
    
}

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/