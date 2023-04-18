package UT1_PD5;

public class Ej4 {
    public static void main(String[] args) {
        //Aca pide 3 argumentos y el programa dice CLARAMENTE que son 2...
        if (args.length == 2) {
            //Esto de abajo no andaba...
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
        //13.4 y 66.1

        //a + b = 79.5
        //a - b = -52.699997
        //a * b = 885.7399
        //a / b = 0.20272315
        //a % b = 13.4
    }
}
