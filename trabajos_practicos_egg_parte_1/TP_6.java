/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
*/
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_6 {

    public static void main(String[] args) {
        double numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = leer.nextDouble();
        
        System.out.println("El doble de el número " + numero + " es: "+ ((int) Math.pow(numero, 2)));
        System.out.println("El triple de el número " + numero + " es: "+ ( (int) Math.pow(numero, 3)));
        System.out.println("La raiz cudrada del número "+ numero + " es: "+(Math.sqrt(numero)));
        
    }
    
}
