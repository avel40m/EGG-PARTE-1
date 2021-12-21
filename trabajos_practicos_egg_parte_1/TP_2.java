
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
*/
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        
        System.out.println("Ingrese el número del primer valor:");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número del primer valor:");
        n2 = leer.nextInt();
        
        System.out.println("La suma es igual a: " + (n1 + n2));
    }
    
}
