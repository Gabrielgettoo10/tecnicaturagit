package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita el monto de la compra al usuario
        System.out.print("Ingrese el monto de su compra: ");
        double montoCompra = scanner.nextDouble();

        //Calcula el monto a pagar considerando el descuento
        double montoAPagar;
        if (montoCompra > 100) {
            montoAPagar = montoCompra * 0.80; //Aplicar un 20% de descuento
        } else {
            montoAPagar = montoCompra; //No se aplica descuento
        }

        //Muestra el monto a pagar
        System.out.println("El monto a pagar es: $" + montoAPagar);
   
    }
    
}
