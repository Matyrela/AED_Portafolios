package UT1_PD4;

import javax.swing.*;

public class Ej1 {

    //Dado el siguiente código fuente:
    public class IdentifyMyParts {
        public static int x = 7; //<-- Instancia
        public int y = 3; //<-- Clase
    }

    /*
    a) ¿Cuáles son las variables de clase?
    b) ¿Cuáles son las variables de instancia?
        ¿Cuál es la salida que produce el siguiente código?


        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

        a.y = 5 \n
        b.y = 6 \n
        a.x = 2 \n
        b.x = 2 \n
        IdentifyMyParts.x = 7 \n
     */




}
/*
IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
    System.out.println("a.y = " + a.y);
    System.out.println("b.y = " + b.y);
    System.out.println("a.x = " + a.x);
    System.out.println("b.x = " + b.x);
    System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
*/
