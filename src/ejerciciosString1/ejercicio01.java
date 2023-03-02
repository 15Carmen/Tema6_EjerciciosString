package ejerciciosString1;

import java.util.Scanner;

public class ejercicio01 {
    /**
     * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene
     * menos caracteres.
     * @param args
     */
    public static void main(String[] args) {
        //Declaramos las variables
        String frase1, frase2;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca 2 frases
        System.out.println("Introduce una frase:");
        frase1 = sc.nextLine();
        System.out.println("Introduce otra frase:");
        frase2 = sc.nextLine();

        if (frase1.length() > frase2.length()){     //Si la frase1 es mayor que la 2, 2 es más corta
            System.out.println("La segunda frase es más corta");
        }else if (frase1.length()<frase2.length()){ //Si la frase1 es menor que la 2, 2 es más larga
            System.out.println("La primera frase es mas corta");
        }else {                                     //Si no es ninguno de los casos anteriores, las frases miden lo mismo
            System.out.println("Las dos frase miden lo mismo");
        }

        //Cerramos el scanner
        sc.close();

    }
}
