package ejercicios.string1;

import java.util.Scanner;

public class Ejercicio04 {
    /**
     * Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. Un ejemplo,
     * la cadena “Hola mundo” quedaría “odnum aloH”. Recuerda probar la función en un main.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        String cadena;          //Cadena de texto que va a introducir el usuario
        String cadenaInvertida; //Cadena de texto que va a estar al revés

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una cadena de texto
        System.out.println("Introduzca una frase: ");
        cadena = sc.nextLine();

        //Guardamos en la variable cadenaInvertida, la cadena de texto al revés
        cadenaInvertida = invertir(cadena);

        //Mostramos las dos cadenas por pantalla
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);


    }

    public static String invertir(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }
}
