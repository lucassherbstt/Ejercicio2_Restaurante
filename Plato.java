package Ejercicio_Restaurante;

import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingredientes> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingredientes ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Plato: " + nombreCompleto +
                "\nPrecio: $" + precio + "\n");
        if (!esBebida) {
            sb.append("Ingredientes:\n");
            for (Ingredientes ing : ingredientes) {
                sb.append("- " + ing + "\n");
            }
        }
        return sb.toString();
    }
}
