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

        if (frase.contains(palabra)){
            String[] palabras = frase.split(" ");
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].equalsIgnoreCase(palabra)) {
                    contador++;
                }
            }

            System.out.println("La palabra aparece " + contador + " veces");
        }else {
            System.out.println("No se ha encontrado la palabra introducida en la frase");
        }

        //Cerramos el scanner
        sc.close();
    }
}
