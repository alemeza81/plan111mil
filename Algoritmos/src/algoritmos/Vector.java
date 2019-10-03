package algoritmos;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[5];
        int i;
        
        /*
        notas[0] = 2;
        notas[1] = 8;
        notas[2] = 7;
        notas[3] = 10;
        notas[4] = 3;
        */
        
        //Usando for tradicional
        //System.out.println("El Array tiene "+notas.length+" elementos");
        //System.out.println("Los Elementos son:");
        
        //Pido Valores Ingresar por Usuario
        for(i=0; i<notas.length; i++) {
            System.out.println("Ingrese Nota: ");
            notas[i] = teclado.nextInt();
            //System.out.println(notas[i]+"");
        }   
            System.out.println("Las Notas son: ");
            //Muestro Valores por Consola en Array
            for(i=0; i<notas.length; i++) {
                System.out.print(notas[i]+" ");
        }
          //Salto de Linea
          System.out.println();
    }
}
