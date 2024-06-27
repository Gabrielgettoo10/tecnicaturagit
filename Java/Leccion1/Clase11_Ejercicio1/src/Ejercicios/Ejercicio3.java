package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado;

        if (numero1 == numero2) {
            resultado = numero1 * numero2;
            System.out.println("Los números son iguales. El resultado de la multiplicación es: " + resultado);
        } else if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.println("El primer número es mayor que el segundo. El resultado de la resta es: " + resultado);
        } else {
            resultado = numero1 + numero2;
            System.out.println("El primer número es menor que el segundo. El resultado de la suma es: " + resultado);
        
        }
    
    }
}
