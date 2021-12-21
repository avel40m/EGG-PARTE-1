/*
17 Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio.
 */
package trabajos_practicos_egg_parte_1;

import java.util.Scanner;

public class TP_17 {

    public static void main(String[] args) {
        char carac; double pago; String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del socio");
        nombre = leer.next();
        System.out.println("Ingrese el tipo de socio (A - B - C)");
        carac = leer.next().charAt(0);
        System.out.println("Ingrese el pago total al tratamiento");
        pago = leer.nextDouble();
        
        switch(carac){
            case 'A':
                System.out.println("Se le otorgo un 50% de descuento al tratamiento por tener la categoria " + carac);
                System.out.println("La persona "+nombre+" tiene que pagar $" + (pago - (pago * 0.5)));
                break;
            case 'B':
                System.out.println("Se le otorgo un 35% de descuento al tratamiento por tener la categoria " + carac);
                System.out.println("La persona "+nombre+" tiene que pagar $"+ (pago - (pago * 0.35)));
                break;
            case 'C':
                System.out.println("No recibe ningún descuento por tener la categoria " + carac);
                System.out.println("La perssona "+nombre+" tiene que pagar $"+pago);
                break;
            default:
                System.out.println("No se pudo hacer la operación");
                break;
        }
    }
    
}
