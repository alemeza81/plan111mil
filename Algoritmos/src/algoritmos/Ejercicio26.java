package algoritmos;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i=0, cont=0;
        
        while(i<10) {
            System.out.println("Ingrese un Número");
            num = teclado.nextInt();
            
            if(num>100) {
                cont++;
            }
            i++;
        }
        
        System.out.println("La Cantidad de Números ingresados Mayor que 100 es: "+cont);
    }
}
