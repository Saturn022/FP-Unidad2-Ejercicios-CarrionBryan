/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio 05: Generar codigo de 6 caracteres
 * Enunciado: Generar un codigo de 6 caracteres: 3 letras aleatorias + 3 digitos.
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    // Crea un codigo formado por tres letras mayusculas aleatorias seguidas de tres digitos
    static String generarCodigo(Random azar) {
        String codigo = "";

        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26)); // genera una letra entre A y Z
            codigo = codigo + letra;
        }

        for (int i = 0; i < 3; i++) {
            int digito = azar.nextInt(10); // genera un digito entre 0 y 9
            codigo = codigo + digito;
        }

        return codigo;
    }

    public static void main(String[] args) {
        Random azar = new Random();
        String codigoGenerado = generarCodigo(azar);

        System.out.println("Codigo generado: " + codigoGenerado);
    }
}