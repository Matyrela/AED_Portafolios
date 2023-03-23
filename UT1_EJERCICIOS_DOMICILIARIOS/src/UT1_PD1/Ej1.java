package UT1_PD1;

public class Ej1 {
    public static void zoop () {
        baffle ();
        System.out.print ("Vos zacata ");
        baffle ();
    }
    public static void main (String[] args) {
        System.out.print ("No, yo ");
        zoop ();
        System.out.print ("Yo ");
        baffle ();
    }
    public static void baffle () {
        System.out.print ("pac");
        ping ();
    }
    public static void ping () {
        System.out.println (".");
    }

    /*Codigo de salida

    No, yo pac.\n
    Vos zacata pac.\n
    Yo pac.\n

    */
}
