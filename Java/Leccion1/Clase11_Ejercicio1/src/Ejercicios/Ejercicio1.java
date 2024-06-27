package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita las tres calificaciones al usuario
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();
        
        //Calcula el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        
        //Determina si el alumno aprueba o reprueba
        if (promedio >= 7) {
            System.out.println("El alumno esta aprobado con: " +promedio);
        } else {
            System.out.println("El alumno esta desaprobado con: " +promedio);
        }
    
    }
}
