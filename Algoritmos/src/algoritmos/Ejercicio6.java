package algoritmos;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        double precio1,precio2,precio3,precio4,precio5;
        double cant1,cant2,cant3,cant4,cant5;
        double resul1,resul2,resul3,resul4,resul5,preciototal;
        String op1 ="",op2="",op3="",op4="",op5="",cp1="",cp2="",cp3="",cp4="",cp5="";
        
        JOptionPane.showInputDialog("Ingrese el Precio de los Artículos");
        precio1 = Integer.parseInt(op1);
        precio2 = Integer.parseInt(op2);
        precio3 = Integer.parseInt(op3);
        precio4 = Integer.parseInt(op4);
        precio5 = Integer.parseInt(op5);
        
        JOptionPane.showInputDialog("Ingrese la Cantidad Vendida por Artículo");
        cant1 = Integer.parseInt(cp1);
        cant2 = Integer.parseInt(cp2);
        cant3 = Integer.parseInt(cp3);
        cant4 = Integer.parseInt(cp4);
        cant5 = Integer.parseInt(cp5);
        
        resul1 = precio1*cant1;
        resul2 = precio2*cant2;
        resul3 = precio3*cant3;
        resul4 = precio4*cant4;
        resul5 = precio5*cant5;
        preciototal = resul1+resul2+resul3+resul4+resul5;
        
        JOptionPane.showMessageDialog(null, "El Importe Total Vendido del Artículo Uno es: "+resul1);
        JOptionPane.showMessageDialog(null, "El Importe Total Vendido del Artículo Dos es: "+resul2);
        JOptionPane.showMessageDialog(null, "El Importe Total Vendido del Artículo Tres es: "+resul3);
        JOptionPane.showMessageDialog(null, "El Importe Total Vendido del Artículo Cuatro es: "+resul4);
        JOptionPane.showMessageDialog(null, "El Importe Total Vendido del Artículo Cinco es: "+resul5);
        JOptionPane.showMessageDialog(null, "El Importe Total Vendido entre Todos los Artículos es: "+preciototal);       
    }
}
