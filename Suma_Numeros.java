/*
Programa básico de lenguaje Java - Programación Orientada a Objetos (POO)
Suma de dos números enteros ingresados por el usuario
 */
package suma_numeros;
import java.util.Scanner;
/*
Roque Ramíres Jesús Guadalupe
 */
public class Suma_Numeros {

    public static void main(String[] args) {
        
        int n1, n2, suma;   /* Definición de variables y el tipo al que corresponden */
        
        Scanner teclado = new Scanner (System.in);
        
        /* System.out.println es una instrucción que se usa para mostrar texto, números o variables en la pantalla y saltar automáticamente a la siguiente línea. */
        
        System.out.println("Introduzca el primer número entero: ");
        n1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número entero: ");
        n2 = teclado.nextInt();
        
        suma = n1 + n2;
        
        System.out.println("La suma de los valores ingresados " + n1 + " + " + n2 + " es: " + suma);
        
    }
    
}
