/*
16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_16 {


    public static void main(String[] args) {
        int num,sumar;
        sumar = 0;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingresar número - (0 para terminar)");
            num = leer.nextInt();
            
            if(num == 0){
                System.out.println("Salio del programa");
                break;
            }
            if(num > 0){
                sumar += num;
            }
        }
        System.out.println("La suma de los números ingresados es: " + sumar);
    }
    
}
