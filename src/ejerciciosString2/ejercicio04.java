package ejerciciosString2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio04 {
    /**
     * Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética.
     * Suponemos que cada palabra de la frase se separa de otra por un único espacio.
     */

    public static void main(String[] args) {
        //Declaración de variables
        String frase;
        String[] palabras;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        //Pasamos la frase a minúsculas para no tener problemas a la hora de ordenar las palabras
        frase = frase.toLowerCase();

        //Introducimos la frase en un array de palabras
        palabras = frase.split(" ");

        //Ordenamos el array de palabras
        Arrays.sort(palabras);

        //Mostramos por consola las palabras ordenadas
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }
}
