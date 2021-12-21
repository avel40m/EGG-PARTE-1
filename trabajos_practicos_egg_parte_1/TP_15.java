/*
15. Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
*/
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;


public class TP_15 {


    public static void main(String[] args) {
        int n1,n2;
        int resp;
        char opc = 'N';
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese el primer número");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo número");
            n2 = leer.nextInt();
            
            System.out.println("Menu principal");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Eligir un número");
            resp = leer.nextInt();
            
            switch(resp){
                case 1: System.out.println("La suma es: " + ( n1 + n2));
                    break;
                case 2: System.out.println("La resta es: " + ( n1 - n2));
                    break;
                case 3: System.out.println("La multiplicación es: " + (n1 * n2));
                    break;
                case 4: System.out.println("La división es: " + ((double) n1 / n2));
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            
            
            System.out.println("Desea salir del programa - (S / N)");
            opc = leer.next().charAt(0);
        }while(opc == 'N');
    }
    
}
