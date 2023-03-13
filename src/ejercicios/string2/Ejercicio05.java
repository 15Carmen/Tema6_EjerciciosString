package ejercicios.string2;

import java.util.Scanner;

public class Ejercicio05 {
    /**
     * Construir un programa que convierta una palabra leída de teclado en secuencias de n letras. El valor n también
     * se debe pedir al usuario por teclado. Por ejemplo, la palabra “destornillador”, dividida en secuencias de 4
     * letras, se mostrará de la siguiente forma:
     * 	dest
     * 	orni
     * 	llad
     * 	or
     * Utiliza la función substring.
     */

    public static void main(String[] args) {
        //Declaración de variables
        String palabra;
        int secuencia;
        int finSecuencia;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una palabra y el tamaño de la secuencia
        System.out.println("Introduzca una palabra: ");
        palabra = sc.nextLine();
        System.out.println("Introduzca el tamaño de la secuencia: ");
        secuencia = sc.nextInt();

        //Recorremos la palabra y vamos imprimiendo las secuencias
        for (int i = 0; i < palabra.length(); i += secuencia) {

            finSecuencia = i + secuencia;
            //Si el final de la secuencia es mayor que la longitud de la palabra
            if (finSecuencia > palabra.length()) {
                //la variable finSecuencia será igual a la longitud de la palabra
                finSecuencia = palabra.length();
            }
            //Imprimimos por consola la secuencia de la palabra
            System.out.println(palabra.substring(i, finSecuencia));
        }
    }
}
