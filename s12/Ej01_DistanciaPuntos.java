/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: Distancia entre dos puntos con Math.sqrt y Math.pow.
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

public class Ej01_DistanciaPuntos {

    // Calcula la distancia entre dos puntos (x1, y1) y (x2, y2) en el plano
    static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double difX = Math.pow(x2 - x1, 2); // eleva al cuadrado la diferencia en x
        double difY = Math.pow(y2 - y1, 2); // eleva al cuadrado la diferencia en y
        return Math.sqrt(difX + difY);      // saca la raiz cuadrada de la suma
    }

    public static void main(String[] args) {
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("Distancia entre los puntos: " + distancia);
    }
}