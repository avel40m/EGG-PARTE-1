/*
19. Adivinar el número del 0 al 100
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_19 {


    public static void main(String[] args) {
        int adivinar,n;
        adivinar = (int) (Math.random()*100) + 1;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese el número a adivinar");
            n = leer.nextInt();
            if(n > adivinar)
                System.out.println("El número "+n+" es mayor, ingrese nuevamente");
            else if(n < adivinar)
                System.out.println("el número "+n+" es menor, ingrese nuevamente");
            
        }while(! (n == adivinar));
        
        System.out.println("Felicitaciones el número era: " + adivinar);
    }
    
}
