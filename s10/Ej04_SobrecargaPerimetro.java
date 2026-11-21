/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 04: Sobrecarga del método perimetro
 * Enunciado: Sobrecarga perimetro(double lado) (cuadrado) y perimetro(double a, double b) (rectángulo).
 * Autor: Carrión Bryan
 * Fecha: 20/11/2026
 */

public class Ej04_SobrecargaPerimetro {

    // Calcula el perímetro de un cuadrado a partir de un lado
    static double perimetro(double lado) {
        return 4 * lado; // multiplica el lado por cuatro lados iguales
    }

    // Calcula el perímetro de un rectángulo a partir de dos lados
    static double perimetro(double a, double b) {
        return 2 * (a + b); // suma ambos lados y multiplica por dos
    }

    public static void main(String[] args) {
        double perCuadrado = perimetro(5.0);       // llama a la versión con un parámetro
        double perRectangulo = perimetro(4.0, 7.5); // llama a la versión con dos parámetros

        System.out.printf("Perímetro del cuadrado: %.2f%n", perCuadrado);
        System.out.printf("Perímetro del rectángulo: %.2f%n", perRectangulo);
    }
}