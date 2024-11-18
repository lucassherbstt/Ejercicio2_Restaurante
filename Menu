package Ejercicio_Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.println("Ingrese la cantidad de platos:");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("Ingrese el nombre del plato:");
            String nombrePlato = scanner.nextLine();
            System.out.println("Ingrese el precio del plato:");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("¿Es bebida? (si/no):");
            String esBebidaRespuesta = scanner.nextLine().trim().toLowerCase();

            Plato plato;
            if (esBebidaRespuesta.equals("si")) {
                plato = new Plato(nombrePlato, precio, true);
            } else if (esBebidaRespuesta.equals("no")) {
                plato = new Plato(nombrePlato, precio, false);
                System.out.println("Ingrese la cantidad de ingredientes:");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine();

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("Ingrese el nombre del ingrediente:");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.println("Ingrese la cantidad:");
                    double cantidad = scanner.nextDouble();
                    System.out.println("Ingrese la unidad de medida:");
                    String unidad = scanner.next();
                    scanner.nextLine();

                    plato.agregarIngrediente(new Ingredientes(nombreIngrediente, cantidad, unidad));
                }
            } else {
                System.out.println("Respuesta no válida. Asumiendo que no es bebida.");
                plato = new Plato(nombrePlato, precio, false);
            }

            platosMenu.add(plato);
        }

        System.out.println("\n--- Menú del Restaurante ---");
        for (Plato plato : platosMenu) {
            System.out.println(plato);
        }

        scanner.close();
    }
}
