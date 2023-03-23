package UT1_PD6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        try {
            File fl = new File("src/UT1_PD6/Ej2.txt");
            Scanner sc = new Scanner(fl);


            int entero = Integer.parseInt(sc.nextLine());
            float coma = Float.parseFloat(sc.nextLine());
            String str = sc.nextLine();

            System.out.format("El entero leído es: %s \n", entero);
            System.out.format("El número de punto flotante es: %s \n", coma);
            System.out.format("La cadena leída es: '%s' \n", str);
            System.out.format("¡Hola %s! La suma de %s y %s es %s. \n", str, entero, coma, entero + coma);
            System.out.format("La división entera de %s y %s es %s y su resto es %s. \n",coma , entero, coma / entero, coma % entero);

            /**
             * La división entera de 33.44 y 12 es 2 y su resto es 9.44.*/
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        /**
         * Parte b)
         * Haz un programa similar al de la parte anterior que devuelva el área y perímetro de una
         * circunferencia a partir del radio de la misma.
         * Los parámetros se deberán leer de stdin.
         * Creando un método estático llamado “leerEntradaStdin” en la clase “Principal” del
         * programa. La firma de este método será:
         * public static void leerEntradaStdin();*/

        int radio;
        System.out.print("Radio: ");
        Scanner sc = new Scanner(System.in);
        radio = Integer.parseInt(sc.nextLine());
        double Area = Math.PI * Math.pow(radio, 2) ;
        System.out.format("El area del cirulo es de %s metros cuadrados.\n", Area);

    }
}
