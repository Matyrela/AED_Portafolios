package UT1_PD5;

public class Ej5 {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);

        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }

    //3 digits before decimal point.
    //2 digits after decimal point.

    //Sacas el valor de donde esta el punto y lo escribis en consola,
    //y despues calculas el total y el punto menos 1 asi determinas donde esta el punto y por consecuencia cuandos digitos despues de la coma
}
