import java.util.Scanner;

public class ejercicio1 {
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

        System.out.println("Introduce una frase:");
        frase1 = sc.nextLine();
        System.out.println("Introduce otra frase:");
        frase2 = sc.nextLine();

        if (frase1.length() > frase2.length()){
            System.out.println("La segunda frase es más corta");
        }else if (frase1.length()<frase2.length()){
            System.out.println("La primera frase es mas corta");
        }else {
            System.out.println("Las dos frase miden lo mismo");
        }

        sc.close();

    }
}
