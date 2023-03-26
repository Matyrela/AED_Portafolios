package UT1_PD5;

public class Ej11 {
    public static void main(String[] args) {
        String original = "este es el curso de Programación 2";
        StringBuilder result = new StringBuilder("hola");
        int index = original.indexOf('a');
        /*1*/ result.setCharAt(0, original.charAt(0)); //"eola"
        /*2*/ result.setCharAt(1, original.charAt(original.length()-1)); //"e2la"
        /*3*/ result.insert(1, original.charAt(4)); //"ee2la"
        /*4*/ result.append(original.substring(1,4)); //"ee2la st"
        /*5*/ result.insert(3, (original.substring(index, index+2) + " ")); //"eee2lao s t"
        System.out.println(result);
    }
}
