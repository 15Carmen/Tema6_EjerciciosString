package ejerciciosString1;

import java.util.Scanner;

public class ejercicio07 {
    /**
     * Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que la frase sea
     * igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo
     * de frase palíndroma es: “Dábale arroz a la zorra el abad”. Las vocales con tilde hacen que un algoritmo tome una
     * frase palíndroma como si no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        String frase;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase sin tildes: ");
        frase = sc.nextLine();

        //Si la frase es igual que invertida (ignorando las mayúsculas y minúsculas), la frase es palíndroma
        if (!frase.equalsIgnoreCase(invertirFrase(frase))) {
            System.out.println("La frase no es palindroma");
        } else { //Si no, no es palíndroma
            System.out.println("La frase es palindroma");
        }

        //Cerramos el scanner
        sc.close();
    }

    /**
     * Metodo que invierte la
     * @param frase que es introducida por teclado por el usuario.
     * @return la frase escrita al revés.
     */
    static String invertirFrase(String frase) {

        //Declaramos las variables
        String invertida = "";

        //Le quitamos los espacios en blanco a la frase
        frase = frase.replace(" ", "");

        //Y la invertimos
        for (int indice = frase.length() - 1; indice >= 0; indice--) {
            invertida += frase.charAt(indice);
        }
        return invertida;
    }
}
