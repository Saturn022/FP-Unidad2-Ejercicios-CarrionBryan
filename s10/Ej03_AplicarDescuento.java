/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 03: Aplicar descuento a un arreglo
 * Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo e imprima antes y después.
 * Autor: Carrión Bryan
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej03_AplicarDescuento {

    // Calcula el porcentaje restante y actualiza cada elemento del arreglo original
    static void aplicarDescuento(double[] precios, double pct) {
        double factor = 1.0 - (pct / 100.0); // determina la proporción que se conserva del precio
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * factor; // modifica el valor de cada posición del arreglo
        }
    }

    public static void main(String[] args) {
        double[] precios = {100.0, 50.0, 25.5, 80.0};

        System.out.println("Antes del descuento: " + Arrays.toString(precios));
        aplicarDescuento(precios, 20.0);
        System.out.println("Después del descuento: " + Arrays.toString(precios));
    }
}