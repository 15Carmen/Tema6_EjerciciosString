package ejercicios.string1;

import java.util.Scanner;

public class Ejercicio10 {
    /**
     * Realizar un programa descodificador. La solución es tan sencilla como utilizar la función diseñada en el
     * ejercicio anterior intercambiando los conjuntos entre sí.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        String fraseCodificada, fraseDecodificada = "";
        char letraFrase;
        final char[] CONJUNTO_1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char[] CONJUNTO_2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        //Declaramos las variables para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase codificada: ");
        fraseCodificada = sc.next();
        //para no tener problemas con las letras mayúsculas, pasamos toda la frase a minúsculas
        fraseCodificada = fraseCodificada.toLowerCase();

        //Recorremos toda la frase
        for (int i = 0; i < fraseCodificada.length(); i++) {
            //Guardamos cada letra de la frase en una variable
            letraFrase = fraseCodificada.charAt(i);

            //La letra decodificada la introducimos en la variable fraseDecodifica
            fraseDecodificada +=  decodifica(CONJUNTO_1, CONJUNTO_2, letraFrase);

        }

        //Imprimimos la frase decodificada por consola
        System.out.println(fraseDecodificada);

        //Cerramos el scanner
        sc.close();
    }


    /**
     * Metodo que decodifica
     * @param c . Si c se encuentra entre los caracteres del
     * @param conjunto2 , lo decodificamos según los caracteres del
     * @param conjunto1
     * @return c decodificado.
     */
    static char decodifica(char[] conjunto1, char[] conjunto2, char c) {

        //Recorremos el primer array de caracteres
        for (int i = 0; i < conjunto2.length; i++) {
            //Si c es igual que alguno de los caracteres del conjunto2
            if (c == conjunto2[i]){
                //Indicamos que c es el carácter del conjunto1 de esa posición
                c = conjunto1[i];
                break;  //Nos salimos del bucle
            }
        }
        return c;
    }
}
