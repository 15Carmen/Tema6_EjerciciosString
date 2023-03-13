package ejercicios.string1;

import java.util.Scanner;

public class Ejercicio09 {
    /**
     * Disponemos de la siguiente relación de letras:
     * conjunto 1: e i k m p q r s t u v
     * conjunto 2: p v i u m t e r k q s
     * <p>
     * Mediante la cual es posible codificar un texto, convirtiendo cada letra del conjunto 1, en su correspondiente
     * del conjunto 2. El resto de las letras no se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas
     * como minúsculas, mostrando siempre la codificación en minúsculas.
     * Un ejemplo: la palabra «PaquiTo» se codifica como «matqvko».
     * Se pide realizar un programa codificador, en el que se implemente la función:
     * char codifica(char conjunto1[],char conjunto2[], char c)
     * que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
     */


    public static void main(String[] args) {

        //Declaramos las variables
        String frase, fraseCodificada = "";
        char letraFrase;
        final char[] CONJUNTO_1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char[] CONJUNTO_2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        //Declaramos las variables para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase");
        frase = sc.next();

        //Para no tener problemas con las letras mayúsculas, pasamos toda la frase a minúsculas
        frase = frase.toLowerCase();

        //Recorremos toda la frase
        for (int i = 0; i < frase.length(); i++) {
            //Guardamos cada letra de la frase en una variable
            letraFrase = frase.charAt(i);

            //La letra codificada la introducimos en la variable fraseCodifica
            fraseCodificada +=  codifica(CONJUNTO_1, CONJUNTO_2, letraFrase);

        }

        //Imprimimos la frase codificada por consola
        System.out.println(fraseCodificada);

        //Cerramos el scanner
        sc.close();

    }

    /**
     * Metodo que codifica
     * @param c . Si c se encuentra entre los caracteres del
     * @param conjunto1 , lo codificamos según los caracteres del
     * @param conjunto2
     * @return c codificado.
     */
    static char codifica(char[] conjunto1, char[] conjunto2, char c) {

        //Recorremos el primer array de caracteres
        for (int i = 0; i < conjunto1.length; i++) {
            //Si c es igual que alguno de los caracteres del conjunto1
            if (c == conjunto1[i]){
                //Indicamos que c es el carácter del conjunto2 de esa posición
                c = conjunto2[i];
                break;  //Nos salimos del bucle
            }
        }
        return c;
    }
}
