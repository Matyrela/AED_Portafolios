package UT1_PD5;

import java.util.Arrays;

public class Ej6 {
    /**
     * ## Metodos
     *
     * - substring : Devuelve una subcadena de la cadena original, desde el índice especificado hasta el final de la cadena o hasta un índice determinado
     * - split : Divide una cadena en subcadenas utilizando el separador especificado y devuelve un array de cadenas
     * - subSequence : Devuelve una subsecuencia de la cadena original, desde el índice inicial hasta el índice final especificados
     * - trim : Devuelve una cadena que representa la cadena original sin los espacios en blanco iniciales y finales
     * - toLowerCase : Devuelve una cadena que representa la cadena original con todos los caracteres en minúscula
     * - toUpperCase : Devuelve una cadena que representa la cadena original con todos los caracteres en mayúscula
     * - indexOf : Devuelve el índice de la primera ocurrencia del carácter o subcadena especificados en la cadena original
     * - lastIndexOf : Devuelve el índice de la última ocurrencia del carácter o subcadena especificados en la cadena original
     * - contains : Devuelve un valor booleano que indica si la cadena original contiene la subcadena especificada
     * - replace : Devuelve una cadena que representa la cadena original con todas las ocurrencias de un carácter o subcadena especificados reemplazados por otro carácter o subcadena especificados
     * - replaceAll : Devuelve una cadena que representa la cadena original con todas las ocurrencias de una expresión regular especificada reemplazadas por otra cadena especificada
     * - replaceFirst : Devuelve una cadena que representa la cadena original con la primera ocurrencia de una expresión regular especificada reemplazada por otra cadena especificada*/

    public static void main(String[] args) {
        String cadena = " Hola Mundo ";
        String subcadena = cadena.substring(5);
        String[] subcadenas = cadena.split(" ");
        CharSequence subsecuencia = cadena.subSequence(5, 10);
        String cadenaSinEspacios = cadena.trim();
        String cadenaEnMinusculas = cadena.toLowerCase();
        String cadenaEnMayusculas = cadena.toUpperCase();
        int indice = cadena.indexOf("M");
        int ultimoIndice = cadena.lastIndexOf("o");
        boolean contiene = cadena.contains("Mundo");
        String reemplazo1 = cadena.replace("o", "0");
        String reemplazo2 = cadena.replaceAll("\\s", "");
        String reemplazo3 = cadena.replaceFirst("o", "0");

        System.out.println("Subcadena: " + subcadena);
        System.out.println("Subcadenas: " + Arrays.toString(subcadenas));
        System.out.println("Subsecuencia: " + subsecuencia);
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);
        System.out.println("Cadena en minúsculas: " + cadenaEnMinusculas);
        System.out.println("Cadena en mayúsculas: " + cadenaEnMayusculas);
        System.out.println("Índice: " + indice);
        System.out.println("Último índice: " + ultimoIndice);
        System.out.println("Contiene: " + contiene);
        System.out.println("Reemplazo 1: " + reemplazo1);
        System.out.println("Reemplazo 2: " + reemplazo2);
        System.out.println("Reemplazo 3: " + reemplazo3);
    }

}
