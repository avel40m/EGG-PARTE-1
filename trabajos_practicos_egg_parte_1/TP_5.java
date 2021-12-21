/*
. Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_5 {


    public static void main(String[] args) {
        double c,f;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el grado centigrado");
        c = leer.nextInt();
        f = 32 + (9 * c / 5);
        System.out.println("El grado en fahrenheit es: " + f);
    }
    
}
