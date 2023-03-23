package UT1_PD1;
public class Ej2 {
    /* 3) ↓ */
    public static void desconcertar(String dirigible) {
        System.out.println (dirigible);
        sipo ("ping", -5);
    }

    /* 2) ↓ 4) ↓ */
    public static void sipo (String membrillo, int flag) {
        if (flag < 0) {
            System.out.println (membrillo + " sup");
        } else {
            System.out.println ("ik");
            desconcertar (membrillo);
            System.out.println ("muaa-ja-ja-ja");
        }
    }

    /* 1) ↓ */
    public static void main (String[] args) {
        sipo ("traqueteo", 13);
    }
}