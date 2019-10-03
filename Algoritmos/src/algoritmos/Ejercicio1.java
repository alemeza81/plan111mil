package algoritmos;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        int num1, num2, resultado;
        String op1, op2;
        
        op1 = JOptionPane.showInputDialog("Ingrese el Primer Número");
        num1 = Integer.parseInt(op1);
        
        op2 = JOptionPane.showInputDialog("Ingrese el Segundo Número");
        num2 = Integer.parseInt(op2);

        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "La Suma es: "+resultado);
    }
}
