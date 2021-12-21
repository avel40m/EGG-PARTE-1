/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_3 {

    public static void main(String[] args) {

        String nombre;
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        
        System.out.print("Ingresar una frase: ");
        nombre = leer.next();
        System.out.println("La frase es: "+nombre);
    }
    
}
