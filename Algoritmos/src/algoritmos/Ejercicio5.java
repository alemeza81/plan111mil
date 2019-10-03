package algoritmos;

//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ejercicio5 {
    public static void main(String[] args) {
        //Scanner Teclado = new Scanner(System.in);
        double peri = 0;
        String op;
        /*System.out.println("Ingrese el perimetro del Cuadrado");
        peri = Teclado.nextDouble();
        peri = peri/4;
        
        System.out.println("El Lado del Cuadrado es: "+peri);
        
        peri = Math.pow(peri,3); //Operación Matemática para realizar exponente
        
        System.out.println("El Volumen del Cubo es: "+peri);
        */
        
        op = JOptionPane.showInputDialog("Ingrese el perimetro del Cuadrado");
        peri = Integer.parseInt(op);
        peri = peri/4;
        
        JOptionPane.showMessageDialog(null, "El Lado del Cuadrado es: "+peri);
        
        peri = Math.pow(peri,3);
        
        JOptionPane.showMessageDialog(null, "El Volumen del Cubo es: "+peri);
        
    }
}
