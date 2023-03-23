package UT1_PD6;

public class Ej4 {
    public static int[] multiplicoarray(int[] a, int[] b) {
        if(!(a.length == b.length)){
            return null;
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] hola = multiplicoarray(new int[]{1,2,3}, new int[]{2,4,3});
        for(int a : hola) {
            System.out.println(a);
        }
    }
}