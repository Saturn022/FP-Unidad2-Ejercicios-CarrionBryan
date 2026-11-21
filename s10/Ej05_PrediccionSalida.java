/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 05: Predicción de salida con 3 llamadas
 * Enunciado: Predice en papel la salida de un programa con 3 llamadas antes de ejecutarlo.
 * Autor: Carrión Bryan
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej05_PrediccionSalida {

    // Suma un valor extra a la copia local del número recibido
    static void sumarExtra(int numero) {
        numero = numero + 5; // modifica solo la copia dentro del método
    }

    // Suma un valor extra a cada elemento del arreglo recibido
    static void agregarBonos(int[] puntos, int extra) {
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = puntos[i] + extra; // cambia los valores directamente en el arreglo
        }
    }

    // Calcula el doble del número recibido y devuelve el resultado
    static int duplicarValor(int numero) {
        return numero * 2; // retorna el nuevo valor para asignarlo donde se llama
    }

    public static void main(String[] args) {
        int puntaje = 10;
        int[] rondas = {2, 4, 6};

        // Primera llamada: pasa un tipo primitivo, puntaje en main no cambia
        sumarExtra(puntaje);
        System.out.println("Llamada 1 -> puntaje = " + puntaje);

        // Segunda llamada: pasa un arreglo, los elementos de rondas sí cambian
        agregarBonos(rondas, 3);
        System.out.println("Llamada 2 -> rondas = " + Arrays.toString(rondas));

        // Tercera llamada: guarda el valor retornado para actualizar puntaje en main
        puntaje = duplicarValor(puntaje);
        System.out.println("Llamada 3 -> puntaje = " + puntaje);
    }
}

/*
 * SALIDA PREDICHA (lo que creo que saldrá antes de ejecutar el programa):
 * Llamada 1 -> puntaje = 10
 * Llamada 2 -> rondas = [5, 7, 9]
 * Llamada 3 -> puntaje = 20
 *
 * SALIDA REAL (la que me dio al ejecutar el programa):
 * Llamada 1 -> puntaje = 10
 * Llamada 2 -> rondas = [5, 7, 9]
 * Llamada 3 -> puntaje = 20
 */