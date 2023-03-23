package UT1_PD6;

public class Ej1 {
    //Escribe un programa llamado Tablero que imprima un tablero de nxn siguiendo el siguiente

    public static void main(String[] args) {
        imprimirTablero(5,5);
    }

    public static void imprimirTablero(int largo, int ancho){

        StringBuilder printer = new StringBuilder();

        for(int y = 0; y < largo; y += 1){
            printer.append(" #");
        }

        for(int x = 0; x < ancho; x += 1){
            System.out.println(printer);
        }

    }
}
