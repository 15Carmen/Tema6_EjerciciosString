package ejerciciosString1;

import java.util.Scanner;

public class ejercicio02 {
    /**
     * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la siguiente: el primer jugador introduce la
     * contraseña; a continuación, el segundo jugador debe teclear palabras hasta que la acierte. El juego debe indicar
     * si la palabra introducida es mayor o menor alfabéticamente que la contraseña.
     *
     * VERSIÓN AVANZADA. El juego, en vez de indicar si la palabra es mayor o menor alfabéticamente que la contraseña,
     * debe mostrar una cadena con los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.
     *
     */
    public static void main(String[] args) {

        //Declaramos las variables
        String passwordUser, passwordPlayer;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una contraseña
        System.out.println("User, introduce la password: ");
        passwordUser = sc.nextLine();

        //Mientras que la contraseña de Player sea distinta a la de User
        do {
            //Le pedimos a player una contraseña
            System.out.println("Introduzca una password Player: ");
            passwordPlayer = sc.nextLine();

            //Comparamos las dos contraseñas
            passwordLength(passwordUser,passwordPlayer);

        }while (!passwordUser.equals(passwordPlayer));

        //Cuando adivine la contraseña, mostramos un mensaje de felicitación
        System.out.println("ENHORABUENA! Acertaste la password");

        //Cerramos el scanner
        sc.close();
    }

    /**
     * Método que compara las longitudes de
     * @param passwordUser y de
     * @param passwordPlayer y si tienen la misma longitud, verifica si la letras son iguales
     * Si no lo son imprime un asterisco.
     */
    static void passwordLength(String passwordUser, String passwordPlayer){

        //Recorremos la contraseña de User
        for (int i = 0; i < passwordUser.length(); i++) {
            //Si i es menor que la longitud de la palabra de User y la letra de la contraseña de User es igual a la de Player
            if (i < passwordPlayer.length() && passwordUser.charAt(i) == passwordPlayer.charAt(i)){
                System.out.print(passwordUser.charAt(i));   //Imprimimos la letra de la contraseña de User
            }else { //Si no, imprimimos un asterisco
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
