import java.util.Scanner;

public class ejercicio8 {
    /**
     * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con
     * “Javalín, javalón”, para después hacer una pausa más o menos larga (la pausa se representa mediante espacios
     * en blanco o tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no comienza sus frases
     * con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coletilla
     * “javalén, len, len”. Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está
     * escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el
     * mensaje sin muletillas.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        String frase, fraseTraducida;
        int posColetillaPrincipio, posColetillaFinal;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        //Buscamos las posiciones de las coletillas características del idioma
        posColetillaPrincipio = frase.indexOf("Javalín, javalón");
        posColetillaFinal = frase.indexOf("javalén, len, len");

        //Si encuentra las coletillas en la frase, se eliminan los espacios innecesarios de la frase y se traduce
        if (posColetillaPrincipio >= 0){
            System.out.println("La frase esta escrita en el idioma de Javalandia");
            frase.trim();
            fraseTraducida = frase.substring(17);

            System.out.println("La frase traducida es: " + fraseTraducida);
        } else if (posColetillaFinal >= 0) {
            System.out.println("La frase esta escrita en el idioma de Javalandia");
            frase.trim();
            fraseTraducida = frase.substring(0,posColetillaFinal);

            System.out.println("La frase traducida es:" + fraseTraducida);
        }else { //Si no encuentra las coletillas en la frase, indica que la frase no está escrita en el idioma de Javalandia
            System.out.println("La frase no esta en el idioma de Javalandia");
        }

        //Cerramos el scanner
        sc.close();
    }

}
