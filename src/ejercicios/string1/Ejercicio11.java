package ejercicios.string1;

import java.util.Scanner;

public class Ejercicio11 {
    /**
     * Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir tanto la palabra como el
     * número de caracteres de la misma.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        String frase;               //Frase que introduce el usuario por consola
        String[] auxPalabra;        //Array de String donde vamos a guardar las palabras de la frase introducida por el usuario
        String palabraMaxLong = ""; //Variable donde guardamos la palabra más larga de la frase

        //Declaramos las variables para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        //Guardamos en el array las palabras de la frase
        auxPalabra = frase.split(" ");

        //Recorremos el array
        for (int i = 0; i < auxPalabra.length; i++) {
            //Si la palabra más larga es más pequeña que la palabra en la posición i del array
            if (palabraMaxLong.length()<auxPalabra[i].length()){
                palabraMaxLong = auxPalabra[i]; //La palabra más larga es la palabra en posición i del array
            }
        }

        //Mostramos por pantalla la palabra más larga y cuantas letras tiene
        System.out.println("La palabra más larga es: " + palabraMaxLong + " y tiene " + palabraMaxLong.length() + " letras");

        //Cerramos el scanner
        sc.close();
    }


}
