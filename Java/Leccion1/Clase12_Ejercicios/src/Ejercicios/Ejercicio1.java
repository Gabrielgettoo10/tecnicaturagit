/*Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {               
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el número total de horas: ");
        int totalHoras = scanner.nextInt();

        int horasEnUnaSemana = 7 * 24;
        int horasEnUnDia = 24;

        int semanas = totalHoras / horasEnUnaSemana;
        int horasRestantes = totalHoras % horasEnUnaSemana;

        int dias = horasRestantes / horasEnUnDia;
        horasRestantes = horasRestantes % horasEnUnDia;

        int horas = horasRestantes;

        System.out.println(totalHoras + " horas son equivalentes a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");        
        
    }
}
