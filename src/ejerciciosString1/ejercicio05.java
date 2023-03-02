package ejerciciosString1;

import java.util.Scanner;

public class ejercicio05 {
    /**
     * Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras
     * introducidas con espacios en blanco. Terminar de leer la frase cuando alguna de las palabras introducidas
     * sea la cadena “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena “fin” no aparecerá
     * en la frase final.
     */


    public static void main(String[] args) {
        //Declaramos las variables
        String frase = "";
        String palabra = "";

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Mientras que la palabra introducida sea distinta de "fin"
        while (!palabra.equalsIgnoreCase("fin")) {
            //Le pedimos al usuario una palabra
            System.out.print("Introduce una palabra: ");
            palabra = sc.next();

            //Si la palabra es distinta de fin la añadimos a la variable frase
            if (!palabra.equalsIgnoreCase("fin")) {
                frase += palabra + " ";
            }
        }

        //Imprimimos por consola la frase completa y le quitamos los espacios en blanco innecesarios
        System.out.println("La frase completa es: " + frase.trim());

        //Cerramos el scanner
        sc.close();
    }
}
