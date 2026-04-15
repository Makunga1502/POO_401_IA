package com.mx.ux.Unidad2.practica1Dominio.validacionProducto;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidacionProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese cantidad en stock: ");
            int cantidad = scanner.nextInt();

            System.out.print("Ingrese precio unitario: ");
            double precio = scanner.nextDouble();


            if (cantidad > 0) {
                if (precio > 0) {
                    System.out.println("Producto registrado: " + nombre);
                } else {
                    System.out.println("Error: El precio debe ser mayor a 0.");
                }
            } else {
                System.out.println("Error: La cantidad debe ser al menos 1.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un valor numérico válido.");
        } finally {
            scanner.close();
        }
    }
}
