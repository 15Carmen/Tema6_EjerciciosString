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

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        //Ponemos la frase en minúsculas
        frase = frase.toLowerCase();

    }
}
