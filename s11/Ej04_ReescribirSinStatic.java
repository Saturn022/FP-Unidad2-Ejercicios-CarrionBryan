/*
 * Sesion: S11 - Ambito de las variables
 * Ejercicio 04: Reescribir sin static
 * Enunciado: Reescribe un programa que usa 3 atributos static para que use parametros y return.
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

/*
 * Version original con 3 atributos static (comentada):
 *
 * public class Ej04_OriginalConStatic {
 *     static double subtotal = 50.0;
 *     static double descuento = 10.0;
 *     static double recargo = 5.0;
 *
 *     static double calcularTotal() {
 *         return subtotal - descuento + recargo;
 *     }
 *
 *     public static void main(String[] args) {
 *         System.out.println("Total: " + calcularTotal());
 *     }
 * }
 */

public class Ej04_ReescribirSinStatic {

    // Calcula el total recibiendo los valores como parametros y devolviendo el resultado con return
    static double calcularTotal(double subtotal, double descuento, double recargo) {
        return subtotal - descuento + recargo;
    }

    public static void main(String[] args) {
        double subtotal = 50.0;
        double descuento = 10.0;
        double recargo = 5.0;

        double totalFinal = calcularTotal(subtotal, descuento, recargo);
        System.out.println("Total: " + totalFinal);
    }
}