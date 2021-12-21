/*
10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java. */

package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_10 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        if(frase.length() == 8){
            System.out.println("Correcto, la frase tiene 8 caracteres");
        }else{
            System.out.println("La frase NO tiene 8 caracteres");
        }
    }
    
}
