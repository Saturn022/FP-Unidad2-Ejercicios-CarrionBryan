/*
 * Sesion: S12 - Metodos de biblioteca
 * Ejercicio 03: Validar contrasena
 * Enunciado: minimo 8 caracteres, al menos una mayuscula y un digito, usando Character.
 * Autor: Carrion Bryan
 * Fecha: 20/11/2026
 */

public class Ej03_ValidarContrasena {

    // Revisa si la clave cumple longitud minima, al menos una mayuscula y un digito
    static boolean esContrasenaValida(String clave) {
        if (clave.length() < 8) {
            return false; // no cumple con el minimo de caracteres
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char caracterActual = clave.charAt(i); // extrae cada caracter de la cadena
            if (Character.isUpperCase(caracterActual)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(caracterActual)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        String clavePrueba = "ClaveSegura1";
        boolean valida = esContrasenaValida(clavePrueba);

        System.out.println("Contrasena: " + clavePrueba);
        System.out.println("Es valida: " + valida);
    }
}