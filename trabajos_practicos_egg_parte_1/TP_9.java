/*
9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_9 {

   public static void main(String[] args) {
      String frase;
      Scanner leer = new Scanner(System.in);
      
       System.out.println("Ingrese una frase para adivinar");
       frase = leer.next();
       
       if(frase.equals("eureka")){
           System.out.println("Frase correcta");
       }else{
           System.out.println("Frase incorrecta");
       }
    }
    
}
