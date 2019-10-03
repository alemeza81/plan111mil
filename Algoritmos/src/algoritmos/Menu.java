package algoritmos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
  
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
           int opcion=0;
           String op="";
          
         op = JOptionPane.showInputDialog("Seleccione una Opción: \n"
            + "1. Sumar 2 Números \n"
            + "2. Volúmen de un Cubo \n"
            + "3. Ventas Artículos \n"
            + "4. Raices de la Ecuación \n"
            + "5. Distancia entre dos Puntos en dms. y cmts. \n"
            + "6. Dias Transcurridos del Evento \n"
            + "7. Cociente Mayor y Menor entre Dos Números \n"
            + "8. Cantidad de Números Ingresados Mayor que 100 \n");
         
         opcion = Integer.parseInt(op);
         
         switch(opcion) {
             case 1:
                 Ejercicio1.main(args);
                 break;
                 
             case 2:
                 Ejercicio5.main(args);
                 break;
                 
             case 3:
                 Ejercicio6.main(args);
                 break;
                 
             case 4:
                 Ejercicio7.main(args);
                 break;
                 
             case 5:
                 Ejercicio8.main(args);
                 break;
                 
             case 6:
                 Ejercicio9.main(args);
                 break;
                 
             case 7:
                 Ejercicio16.main(args);
                 break;
                 
             case 8:
                 Ejercicio26.main(args);
                 break;
         }
         
    }
}
