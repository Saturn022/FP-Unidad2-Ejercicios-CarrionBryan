/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: Marca el ámbito de cada variable indicando si es local, de bloque o static.
 * Autor: Carrión Bryan
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    static int totalLlamadas = 0; // variable static: vive durante toda la ejecución del programa
    static int ajusteExtra = 2;    // variable static: compartida por todos los métodos de la clase

    static int calcularAjuste(int valor) {
        int parcial = valor * 2;        // variable local: existe solo dentro de calcularAjuste
        int resultado = parcial + ajusteExtra; // variable local: existe solo dentro de calcularAjuste
        totalLlamadas++;
        return resultado;
    }

    public static void main(String[] args) {
        int acumulado = 0; // variable local: existe solo dentro de main

        for (int ronda = 1; ronda <= 3; ronda++) { // ronda es variable de bloque: existe solo dentro del for
            int pasoActual = calcularAjuste(ronda); // pasoActual es variable de bloque: existe solo dentro del for
            acumulado += pasoActual;
        }

        if (acumulado > 10) {
            int bonificacion = 5; // bonificacion es variable de bloque: existe solo dentro del if
            acumulado += bonificacion;
        }

        System.out.println("Acumulado final: " + acumulado);
        System.out.println("Total de llamadas: " + totalLlamadas);
    }
}