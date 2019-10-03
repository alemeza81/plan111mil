package algoritmos;

import java.util.Scanner;

public class For_y_While 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el Número para la Tabla: ");
        byte num = lector.nextByte(); //Tabla del número num usando for
        System .out.println("Uso de FOR");
        for(int i=1; i<=0; i++) 
            {
                System.out.println(i*num);
            }
        System.out.println("Uso de WHILE");
        int contador = 1;
        while(contador<=10) {
            System.out.println(contador=num);
            contador++;
        }
        System.out.println("Uso de DO WHILE");
        contador = 1;
        do {
            System.out.println(contador*num);
            contador++;
        }while(contador<=10);
    }
}
