/*Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante. 
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la calificación de participación: ");
        double participacion = scanner.nextDouble();

        System.out.print("Digite la calificación del primer examen parcial: ");
        double primerParcial = scanner.nextDouble();

        System.out.print("Digite la calificación del segundo examen parcial: ");
        double segundoParcial = scanner.nextDouble();

        System.out.print("Digite la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        double calificacionFinal = (participacion * 0.10) +
                                   (primerParcial * 0.25) +
                                   (segundoParcial * 0.25) +
                                   (examenFinal * 0.40);

        System.out.println("La calificación final del estudiante es: " + calificacionFinal);
        
    }
    
}
