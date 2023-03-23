package UT1_PD7;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {
        String s = "1";

        while (s != "1000") {
            s += "0";
        }




    }




    //¿Por qué esto es así? ¿Qué diferencia representa con otros lenguajes como C#?
    //R: En java no se pueden comparar string con ==, es necesario usar .equals(""); o .equalsIgnoreCase("");
}
