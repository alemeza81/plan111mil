package algoritmos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A,B,C,res,resul1,resul2;
        
        System.out.println("Ingrese el Valor de Coeficiente de A: ");
        A = teclado.nextDouble();
        System.out.println("Ingrese el Valor de Coeficiente de B: ");
        B = teclado.nextDouble();
        System.out.println("Ingrese el Valor de Coeficiente de C: ");
        C = teclado.nextDouble();
        
        //res = (-1)*B;
        resul1 = ((-B)-(Math.sqrt(Math.pow(B,2)-4*A*C)))/(2*A);
        resul2 = ((-B)+(Math.sqrt(Math.pow(B,2)-4*A*C)))/(2*A);
        
        System.out.println("Las Raices de la Ecuación son: " +resul1+ " y " +resul2);
    }
}