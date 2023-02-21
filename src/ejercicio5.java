import java.util.Scanner;

public class ejercicio5 {
    /**
     * Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras
     * introducidas con espacios en blanco. Terminar de leer la frase cuando alguna de las palabras introducidas
     * sea la cadena “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena “fin” no aparecerá
     * en la frase final.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String palabra = "";

        while (!palabra.toLowerCase().equals("fin")) {
            System.out.print("Introduce una palabra: ");
            palabra = sc.next();

            if (!palabra.toLowerCase().equals("fin")) {
                frase += palabra + " ";
            }
        }

        System.out.println("La frase completa es: " + frase.trim());

        //Cerramos el scanner
        sc.close();
    }
}
