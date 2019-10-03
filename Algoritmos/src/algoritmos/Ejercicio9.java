package algoritmos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tiempo=0, minutos;
        
        System.out.println("Ingrese la Cantidad de Días Totales del Acontecimiento: ");
        tiempo = teclado.nextDouble();
            
        minutos = (tiempo*24)*60;
        
        System.out.println("Los Minutos Transcurridos Totales del Acontecimiento Fueron: "
                +minutos+ " Min.");
    }
}
