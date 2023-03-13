package ejercicios.string1;

import java.util.Scanner;

public class Ejercicio03 {
    /**
     * Diseña una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios
     * en blanco tiene.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        String frase;
        int contadorEspaciosEnBlanco = 0;

        //Crear el scanner para leer por consola
        Scanner sc = new Scanner(System.in);

        // Le pedimos al usuario que introduzca una frase por teclado
        System.out.println("Introduce una frase:");
        frase = sc.nextLine();

        //Contamos los espacios en blanco en la frase
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorEspaciosEnBlanco++;
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("La frase introducida tiene " + contadorEspaciosEnBlanco + " espacios en blanco.");

        // Cerrar el objeto Scanner
        sc.close();
    }


}
