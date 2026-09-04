/*
Programa básico de lenguaje Java - Programación Orientada a Objetos (POO)
Suma de dos números enteros ingresados por el usuario mediante cuadros de diálogo
 */

package sumas_con_cuadros_texto;

/* Escribir clase de la biblioteca Java Swing que permite crear ventanas emergentes o cuadros de diálogo estándar para mostrar mensajes, obtener datos del usuario o pedir confirmaciones*/

import javax.swing.JOptionPane;

/*
Roque Ramíres Jesús Guadalupe
 */

public class Sumas_Con_Cuadros_Texto {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2, suma;
        
        /* Pedimos datos al usuario mediante conversión del texto usando métodos */
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número entero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el aegundo número entero: "));
        suma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
    }
    
}
