/*
. Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_7 {


    public static void main(String[] args) {
       int n1 , n2;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el primer número");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextInt();
        
        if(n1 > n2){
            System.out.println("El número "+n1+" es mayor que "+n2);
        }else if(n2 > n1){
            System.out.println("El número "+n2+" es mayor que "+n1);
        }else{
            System.out.println("Números iguales");
        }
    }
    
}
