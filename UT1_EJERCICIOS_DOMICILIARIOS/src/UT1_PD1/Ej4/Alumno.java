package UT1_PD1.Ej4;

/*
a) Indicar el error al ejecutar la clase Alumno y corregirlo. ¿cómo lo detectaste?
R:  Habian metodos de la clase fuera del la clase y el nombre no se pasaba como parametro

b) Indicar el error al ejecutar el método “recorrer” y corregirlo. ¿cómo lo detectaste?
R:  El problema es que cuando accedemos a un char de un String el valor siempre es uno menos, ejemplo
    String h = "Hola";
    La longitud de ese string es de 4 pero en memoria las letras van del 0 - 3

    cambie el for para que en vez de ser <= sea solo <

c) Indicar el error al ejecutar el método “getValor” y corregirlo. ¿cómo lo detectaste?
R:  idx tiene un valor de 9, pero el tamaño del vector es 8

d) Indicar el error al ejecutar el método “getPrimerCaracter” y corregirlo. ¿cómo lo detectaste?
R:  El codigo generaba un array de strings e intentaba conseguir el primero char, el cual era null
    cambie el codigo para que simplemente obtenga el char 0 del string

e) Indicar el error al ejecutar el método “paraAString” y corregirlo. ¿cómo lo detectaste?
R:  El codigo hacia un array y lo reemplace por un String.valueOf(a);
*/

public class Alumno {
    private String nombre;

    public Alumno(String Nombre) {
        nombre = Nombre;
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Booggy");
        System.out.println(alumno.getNombreAdmiracion());

        System.out.println(recorrer("Booggy ! AsD"));

        System.out.println(getValor());

        System.out.println(getPrimerCaracter("Booggy"));

        System.out.println(paraAString(5));
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res += 1;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        return (palabra.charAt(0));
    }

    public static String paraAString(int a) {
        return String.valueOf(a);
    }
}
