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

        Scanner sc = new Scanner(System.in);

        System.out.println("User, introduce la password: ");
        passwordUser = sc.nextLine();

        do {
            System.out.println("Introduzca una password Player: ");
            passwordPlayer = sc.nextLine();

            passwordLength(passwordUser,passwordPlayer);

        }while (!passwordUser.equals(passwordPlayer));

        System.out.println("ENHORABUENA! Acertaste la password");

        sc.close();
    }

    /**
     * Método que compara las longitudes de
     * @param passwordUser y de
     * @param passwordPlayer y si tienen la misma longitud, verifica si la letras son iguales
     * Si no lo son imprime un asterisco.
     */
    static void passwordLength(String passwordUser, String passwordPlayer){

        for (int i = 0; i < passwordUser.length(); i++) {
            if (i < passwordPlayer.length() && passwordUser.charAt(i) == passwordPlayer.charAt(i)){
                System.out.print(passwordUser.charAt(i));
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
