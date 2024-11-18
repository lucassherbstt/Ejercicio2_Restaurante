package Ejercicio_Restaurante;

public class Ingredientes {
    private String nombre;
    private double cantidad;
    private String unidadMedida;

    public Ingredientes(String nombre, double cantidad, String unidadMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return nombre + " " + cantidad + " " + unidadMedida;
    }
}
