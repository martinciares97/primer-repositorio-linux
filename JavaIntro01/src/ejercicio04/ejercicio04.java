/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author MartinExo
 */
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        float temperatura_celsius;
        float temperatura_fahrenheit;
        
        System.out.println("Ingrese una temperatura en grados celsius");
        temperatura_celsius = leer.nextFloat();
        
        temperatura_fahrenheit = 32 + (9 * temperatura_celsius /5);
        
        System.out.println(temperatura_celsius + "ºC equivalen a " + temperatura_fahrenheit + "ºF");
        
        
    }
    
}

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/