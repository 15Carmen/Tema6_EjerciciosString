package ejercicios.string1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    /**
     * Un anagrama es una palabra, o frase, que resulta de la transposición de otra palabra o frase. Ejemplos de
     * anagramas para la palabra roma son: amor, ramo o mora. Construir un programa que solicite al usuario dos
     * palabras e indique si son anagramas una de otra.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        String palabra1, palabra2;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca dos palabras
        System.out.println("Introduzca una palabra: ");
        palabra1 = sc.nextLine();
        palabra1 = palabra1.toLowerCase();  //Ponemos la palabra en minúscula para np tener problemas a la hora de comparar las dos palabras
        System.out.println("Introduzca otra palabra: ");
        palabra2 = sc.nextLine();
        palabra2 = palabra2.toLowerCase();  //Ponemos lña palabra en minúscula


        if (esAnagrama(palabra1, palabra2)) {   //Si las palabras son anagramas imprimimos un mensaje confirmándolo por consola
            System.out.println("La palabra " + palabra2 + " es un anagrama de " + palabra1);
        } else {                                //Si no lo son, se lo informamos al usuario por consola
            System.out.println("No son anagramas");
        }

        //Cerramos el scanner
        sc.close();
    }

    /**
     * Método que comprueba si dos palabras son anagramas
     * @param palabra1
     * @param palabra2
     * @return true si son anagramas, false si no lo son
     */
    public static boolean esAnagrama(String palabra1, String palabra2) {

        //Declaramos las variables
        boolean anagrama = false;
        char[] palabra1Char = palabra1.toCharArray();
        char[] palabra2Char = palabra2.toCharArray();

        //Si las palabras tienen la misma longitud
        if (palabra1.length() == palabra2.length()) {
            //Ordenamos los arrays
            Arrays.sort(palabra1Char);
            Arrays.sort(palabra2Char);
            //Si los arrays son iguales, las palabras son anagramas
            if (Arrays.equals(palabra1Char, palabra2Char)) {
                anagrama = true;
            }
        }

        return anagrama;
    }
}
