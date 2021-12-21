/*
. Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_4 {

    public static void main(String[] args) {
       String frase;
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese su frase: ");
        frase = leer.next();
        System.out.println("Su frase en minuscula es: " + frase.toLowerCase());
        System.out.println("Su frase en mayuscula es: " + frase.toUpperCase());
    }
    
}
