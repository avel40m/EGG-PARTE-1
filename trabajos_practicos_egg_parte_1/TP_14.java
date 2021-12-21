/*
14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_14 {

    public static void main(String[] args) {
        int valor, n,suma;
        suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero del valor limite");
        valor = leer.nextInt();
        
        do{
            System.out.println("Ingresar número");
            n = leer.nextInt();
            suma += n;
        }while(suma < valor);
    }
    
}
