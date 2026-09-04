/*
Programa básico de lenguaje Java - Programación Orientada a Objetos (POO)
Calcular año de nacimiento a partir del año actual y edad de una persona
 */
package obtener_nacimiento_edad_persona;

/* Escribir clase de la biblioteca Java Swing que permite crear ventanas emergentes o cuadros de diálogo estándar para mostrar mensajes, obtener datos del usuario o pedir confirmaciones*/

import javax.swing.JOptionPane;

/*
Roque Ramíres Jesús Guadalupe
 */

public class Obtener_Nacimiento_Edad_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int año_actual, edad, año_nacimiento;
        
        año_actual = Integer.parseInt(JOptionPane.showInputDialog("Ingresa año actual: "));
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        año_nacimiento = año_actual - edad;
        
        JOptionPane.showMessageDialog(null, "Naciste en el año: " +año_nacimiento);
    
    }
    
}
