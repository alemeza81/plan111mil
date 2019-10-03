package algoritmos;

import java.util.Scanner;

public class Ejercicio2a {
    public static void main(String[] args) {
    
        Scanner Teclado = new Scanner(System.in);
        String usuario = "Gaston";
        String clave = "12345";
        
        System.out.println("Ingrese un Usuario");
        //.next obtiene los datos que ingrese sea entero o no
        String usuario_ = Teclado.next();
        
        System.out.println("Ingrese la Contraseña");
        String clave_ = Teclado.next();
                
        if(usuario_.equals(usuario) && clave_.equals(clave)) {
            System.out.println("Ingresaste Correctamente");
        }else {
            System.out.println("Usuario y Contraseña Incorrectos");
        }
    }
}
