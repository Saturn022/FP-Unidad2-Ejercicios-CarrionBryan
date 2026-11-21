/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: Indica qué líneas no compilan y por qué.
 * Autor: Carrión Bryan
 * Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    static int limite = 10;

    static int sumarConLimite(int base) {
        int extra = 5;
        return base + extra + limite;
    }

    public static void main(String[] args) {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            int parcial = i * 2;
            total += parcial;
        }

        // System.out.println(i);
        // Mensaje del compilador: error: cannot find symbol (symbol: variable i)
        // Causa: i es una variable de bloque del ciclo for y deja de existir cuando se cierra la llave del for.

        // System.out.println(parcial);
        // Mensaje del compilador: error: cannot find symbol (symbol: variable parcial)
        // Causa: parcial fue declarada dentro del bloque del for y no es visible fuera de ese bloque.

        // System.out.println(extra);
        // Mensaje del compilador: error: cannot find symbol (symbol: variable extra)
        // Causa: extra es una variable local del método sumarConLimite y no existe dentro de main.

        int sinValor;
        // System.out.println(sinValor);
        // Mensaje del compilador: error: variable sinValor might not have been initialized
        // Causa: las variables locales no tienen valor por defecto y deben inicializarse antes de usarse.

        System.out.println("Total final: " + total);
    }
}