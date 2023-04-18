package UT1_PD5;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {

        System.out.println(Vocaloide("Hola"));
    }

    public static int Vocaloide(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Arrays.stream(Vocales.values()).anyMatch(v -> v.name().equals(Character.toString(ch).toUpperCase()))) {
                num++;
            }
        }
        return num;
    }
}
