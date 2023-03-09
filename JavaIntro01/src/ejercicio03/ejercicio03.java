/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author MartinExo
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String frase;
        String frase_min;
        String frase_may;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        frase_min = toLowerCase(frase);
        frase_may = toUpperCase(frase);
        
        System.out.println("Frase en minuscula: {" + frase_min + "}");
        System.out.println("Frase en mayuscula: {" + frase_may + "}");
        
    }
    
}

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/