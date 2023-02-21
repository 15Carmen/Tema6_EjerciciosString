import java.util.Scanner;

public class ejercicio9 {
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
        String frase;
        String fraseCodificada = "";
        final char[] CONJUNTO_1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char[] CONJUNTO_2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        //Declaramos las variables para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase");
        frase = sc.next();


    }

    static char codifica(char[] conjunto1, char[] conjunto2, char c) {

        String frase, fraseCodificada;

        for (int i = 0; i < conjunto1.length; i++) {


        }

        return c;
    }
}
