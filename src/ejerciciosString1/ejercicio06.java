package ejerciciosString1;

import java.util.Scanner;

public class ejercicio06 {
    /**
     * Diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuántas veces
     * aparece la palabra en la frase.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        String frase, palabra;
        int posicion = 0;
        int contador = 0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase y una palabra
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();

        //Si la frase contiene la palabra introducida por el usuario
        if (frase.contains(palabra)){
            //Introducimos en un array de String las palabras de la frase introducida por el usuario
            String[] palabras = frase.split(" ");

            //Recorremos el array de String
            for (int i = 0; i < palabras.length; i++) {
                //Si la palabra del array es igual que la palabra introducida por el usuario
                if (palabras[i].equalsIgnoreCase(palabra)) {
                    contador++; //Incrementamos el contador
                }
            }

            //Imprimimos cuanta veces aparece la palabra por consola
            System.out.println("La palabra aparece " + contador + " veces");
        }else { //Si la frase no contiene la palabra introducida, se lo informamos al usuario
            System.out.println("No se ha encontrado la palabra introducida en la frase");
        }

        //Cerramos el scanner
        sc.close();
    }
}
