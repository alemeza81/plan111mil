package algoritmos;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0,i=0,cont=0;
        
        while(i<0 || num<0) {
            System.out.println("Ingrese un Número");
            num = teclado.nextInt();
            
                if(num>100) {
                    cont++;
                }
            i=i+1; 
        }
        
        System.out.println("La Cantidad de Números ingresados Mayor que 100 es: "+cont);
    }
}
