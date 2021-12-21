/*
18. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_18 {

    public static void main(String[] args) {
        int n,nP = 0,nI = 0;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {
            System.out.println("Ingrese un número");
            n = leer.nextInt();
            if(n % 5 == 0){
                System.out.println("El número ingresado es un multiplo de 5 - por lo tanto termino el ciclo");
                break;
            }
            
            if(n > 0){
                if(n % 2 == 0)
                    nP++;
                else
                    nI++;
            }else
                System.out.println("Solamente se aceptan números positivos");
        }
        
        System.out.println("Cantidad de números pares ingresados: " + nP);
        System.out.println("Cantidad de números impares ingresados: " + nI);
        
    }
    
}
