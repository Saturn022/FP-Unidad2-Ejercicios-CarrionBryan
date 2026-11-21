/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: Lanzar dos dados 1000 veces y contar cuantas veces suman 7 (Random).
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Random azar = new Random(); // genera valores aleatorios para los dados
        int lanzamientos = 1000;    // cantidad total de tiradas a simular
        int sumaSiete = 0;          // acumula las veces en que la suma da 7

        for (int i = 0; i < lanzamientos; i++) {
            int dadoUno = azar.nextInt(6) + 1; // numero entero entre 1 y 6
            int dadoDos = azar.nextInt(6) + 1; // numero entero entre 1 y 6

            if (dadoUno + dadoDos == 7) {
                sumaSiete++;
            }
        }

        double porcentaje = (sumaSiete * 100.0) / lanzamientos; // calcula el porcentaje sobre 1000 tiradas

        System.out.println("Veces que sumaron 7: " + sumaSiete);
        System.out.println("Porcentaje: " + porcentaje + "%");
    }
}