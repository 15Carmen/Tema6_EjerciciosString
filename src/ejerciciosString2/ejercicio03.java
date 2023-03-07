package ejerciciosString2;

import java.util.Scanner;

public class ejercicio03 {

    /**
     * Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier combinación de mayúsculas
     * y minúsculas) en el nombre de una variable que utilice la nomenclatura Camel. Por ejemplo, la frase “Me GUsta
     * merenDAR gaLLEtas”, se convertirá en “meGustaMerendarGalletas”.
     * Supondremos que cada palabra que compone la frase está separada por un único espacio en blanco.
     * NOTA: Puedes hacer uso de las funciones estáticas toLowerCase y toUpperCase definidas en la clase Character.
     */
    public static void main(String[] args) {
        //Declaración de variables
        String frase;
        String[] palabras;
        String fraseCamel="";

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        //Introducimos la frase en un array de palabras
        palabras = frase.split(" ");

        //Recorremos el array de palabras y vamos concatenando las palabras en camel
        for (String palabra : palabras) {
            //Introducimos en la variable fraseCamel la primera letra de la palabra en mayúscula y el resto en minúscula
            fraseCamel += palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
        }

        //Imprimimos por consola la frase en camel
        System.out.println(fraseCamel);



    }
}
