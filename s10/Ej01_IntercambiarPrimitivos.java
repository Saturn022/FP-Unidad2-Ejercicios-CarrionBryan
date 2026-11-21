/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 01: Intercambiar primitivos
 * Enunciado: Escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    // Recibe copias de los valores enviados y los intercambia solo dentro de este método
    static void intercambiar(int a, int b) {
        int respaldo = a; // guarda el valor de a antes de sobrescribirlo
        a = b;            // asigna el valor de b a la copia local a
        b = respaldo;     // asigna el valor original de a a la copia local b
        System.out.println("Dentro del método -> a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int primero = 10;
        int segundo = 20;

        System.out.println("Antes de llamar -> primero = " + primero + ", segundo = " + segundo);
        intercambiar(primero, segundo);
        System.out.println("Después de llamar -> primero = " + primero + ", segundo = " + segundo);
    }
}

/*
 * ¿Funciona? ¿Por qué?
 * No funciona para intercambiar primero y segundo en main. Java siempre pasa una copia del
 * valor de las variables primitivas. El método modifica únicamente sus propias copias locales,
 * mientras que las variables originales en main mantienen su valor inicial.
 */