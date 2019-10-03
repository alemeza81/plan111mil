package algoritmos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distdc, distcm;
        
        System.out.println("Ingrese la Distancia entre los Dos Puntos: ");
        distdc = teclado.nextDouble();
        
        distcm = distdc * 10;
        
        System.out.println("La Distancia entre lod Dos Puntos es " +distdc+ " en Dmts");
        System.out.println("La Distancia entre lod Dos Puntos es " +distcm+ " en Cmts");
    }
}
