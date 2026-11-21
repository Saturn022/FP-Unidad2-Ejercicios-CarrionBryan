/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 02: Intercambiar elementos de un arreglo
 * Enunciado: Escribe intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 * Autor: Carrión Bryan
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    // Recibe una copia de la referencia al arreglo y modifica los elementos en las posiciones indicadas
    static void intercambiar(int[] v, int i, int j) {
        int respaldo = v[i]; // guarda el elemento en la posición i
        v[i] = v[j];         // mueve el elemento de la posición j hacia i
        v[j] = respaldo;     // coloca el valor guardado en la posición j
    }

    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40};

        System.out.println("Antes: " + Arrays.toString(valores));
        intercambiar(valores, 0, 2);
        System.out.println("Después: " + Arrays.toString(valores));
    }
}

/*
 * ¿Por qué ahora sí funciona?
 * Aunque Java también pasa el argumento por valor, en este caso el valor copiado es la
 * referencia que apunta al arreglo en memoria. Por medio de esa referencia se accede al mismo
 * arreglo creado en main y se intercambian los elementos de las posiciones indicadas.
 */