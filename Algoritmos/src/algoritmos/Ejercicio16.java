package algoritmos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Ingrese el Primer Número: ");
        num1 = teclado.nextDouble();
        System.out.println("Ingrese el Segundo Número: ");
        num2 = teclado.nextDouble();
        
        if(num1>num2) {
            System.out.println("El Cociente entre el Número Mayor: " +num1+ " Y el Menor: " +num2
                    + "es: " +num1/num2);
        }else {
            System.out.println("El Cociente entre el Número Mayor: " +num2+ " Y el Menor: " +num1
                    + "es: " +num2/num1);
        }
    }
}
