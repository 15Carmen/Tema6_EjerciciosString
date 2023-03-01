import java.util.Scanner;

public class ejercicio11 {
    /**
     * Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir tanto la palabra como el
     * número de caracteres de la misma.
     */

    public static void main(String[] args) {
        String frase;
        String[] auxPalabra;
        String palabraMaxLong = "";

        //Declaramos las variables para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();
        auxPalabra = frase.split(" ");

        for (int i = 0; i < auxPalabra.length; i++) {
            if (palabraMaxLong.length()<auxPalabra[i].length()){
                palabraMaxLong = auxPalabra[i];
            }
        }

        System.out.println("La palabra más larga es: " + palabraMaxLong + " y tiene " + palabraMaxLong.length() + " letras");
    }


}
