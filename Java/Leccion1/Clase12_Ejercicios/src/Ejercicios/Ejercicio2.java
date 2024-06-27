/*Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite el valor de b: ");
        double b = scanner.nextDouble();
       
        int resultado = (int) (Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b);
       
        System.out.println("El resultado de (a+b)^2 es: " + resultado);
    
    }       
}
