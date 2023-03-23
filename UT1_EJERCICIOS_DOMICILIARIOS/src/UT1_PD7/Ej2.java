package UT1_PD7;

public class Ej2 {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";
        if ( s1 == s2 ) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }

        main2();
        Correccion();
    }

    public static void main2() {
        String s1 = new String("Hola");
        String s2 = "Hola";
        if ( s1 == s2 ) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }
    }

    public static void Correccion() {
        String s1 = "Hola";
        String s2 = "Hola";

        if (s1.equals(s2)) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }
    }
}

//¿Qué sentencia se ejecuta como resultado del If en cada caso y por qué?
//  Busca en internet referencias que te permitan explicar las respuestas a las preguntas anteriores. Asegúrate que las
//  mismas sean autoritativas y cítalas adecuadamente en tu respuesta.

//R:
//  El problema es que el compilador al ver que s1 y s2 "Son iguales" les asigna el mismo valor de memoria, entonces el if devuelve true
//  https://www.campusmvp.es/recursos/post/java-comparacion-de-cadenas-literales-clases-repositorio-de-cadenas.aspx

//Propone una versión correcta del código del Ejercicio #1.