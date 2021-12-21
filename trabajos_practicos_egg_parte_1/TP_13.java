/*
13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_13 {


    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese una nota entre 0 - 10");
            nota = leer.nextInt();
            
        }while(! (nota >= 0 && nota <= 10));
        System.out.println("Correcto!!!!!!!");
        
    }
    
}
