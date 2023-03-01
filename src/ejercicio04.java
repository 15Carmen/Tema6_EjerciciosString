public class ejercicio04 {
    /**
     * Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. Un ejemplo,
     * la cadena “Hola mundo” quedaría “odnum aloH”. Recuerda probar la función en un main.
     */

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        String cadenaInvertida = invertir(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String invertir(String cadena) {
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }
}
