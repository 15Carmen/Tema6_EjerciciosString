package ejerciciosString1;

import java.util.Scanner;

public class ejercicio13 {
    /**
     * Diseñar un algoritmo que lea del teclado una frase e indique, para las letras que aparecen en la frase, cuántas
     * veces se repite cada una. Se consideran iguales las letras mayúsculas y las minúsculas para realizar la cuenta.
     * Un ejemplo sería:
     * Frase: En un lugar de la Mancha.
     * Resultado:
     * a: 4 veces
     * d: 1 vez
     * e: 2 veces
     * . . .
     */

    public static void main(String[] args) {

        //Decalramos las variables
        String frase;

        //Declaramos las variables para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();    //Ponemos la frase en minúscula para no tener problemas a la hora de contar las letras
        frase = frase.replaceAll(" ", "");  //Quitamos los espacios en blanco de la frase
        contarLetras(frase);
    }

    /**
     * Método que cuenta las veces que aparece cada letra en una frase
     * @param frase
     */
    public static void contarLetras(String frase) {
        char[] fraseChar = frase.toCharArray();
        int contador;

        //Recorremos el array de caracteres
        for (int i = 0; i < fraseChar.length; i++) {
            //Inicializamos el contador a 0
            contador = 0;    //Si no lo inicializamos a 0, el contador se queda con el valor que tenía en la última iteración del bucle

            //Recorremos el array de caracteres para contar las veces que aparece cada letra
            for (int j = 0; j < fraseChar.length; j++) {
                //Si la letra de la posición i es igual a la letra de la posición j, sumamos 1 al contador
                if (fraseChar[i] == fraseChar[j]) {
                    contador++;
                }
            }
            //Si la letra no está repetida, la imprimimos por consola
            if (!repetida(fraseChar, i)) {
                System.out.println(fraseChar[i] + ": " + contador + " veces");
            }
        }
    }

    /**
     * Método que comprueba si una letra está repetida en un array de caracteres
     * @param letras
     * @param indice
     * @return true si está repetida, false si no lo está
     */
    public static boolean repetida(char[] letras, int indice) {
        //Declaramos las variables
        boolean repetida = false;
        int cont=0;

        //Mientras no esté repetida, el contador sea menor que el índice
        while(!repetida && cont<indice) {
            //Si la letra de la posición cont es igual a la letra de la posición indice, repetida es true
            if (letras[cont] == letras[indice]) {
                repetida = true;
            }
            //Incrementamos el contador
            cont++;
        }

        return repetida;
    }
}
