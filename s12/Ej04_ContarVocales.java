/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: Contar vocales de una frase (String + Character).
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

public class Ej04_ContarVocales {

    // Cuenta cuantas vocales tiene el texto recibido sin importar mayusculas o minusculas
    static int contarVocales(String frase) {
        int totalVocales = 0;
        String minusculas = frase.toLowerCase(); // pasa toda la frase a minusculas para comparar mas facil

        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i); // toma el caracter en la posicion actual
            if (Character.isLetter(letra)) {   // verifica que sea una letra antes de revisar si es vocal
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    totalVocales++;
                }
            }
        }

        return totalVocales;
    }

    public static void main(String[] args) {
        String texto = "Programacion en Java desde cero";
        int cantidad = contarVocales(texto);

        System.out.println("Frase: " + texto);
        System.out.println("Cantidad de vocales: " + cantidad);
    }
}