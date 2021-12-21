/*
8. Crear un programa que dado un numero determine si es par o impar.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_8 {


    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        
        if(n %2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
    
}
