package UT1_PD1.Ej5;

/*
EJERCICIO 5 Bucles:

Escriba una clase Contador y utilice un bucle while para mostrar el valor de una variablecontador que se incrementa de a uno.
Siga los siguientes pasos para crear su clase:

    1. Cree una clase llamada contador con tres atributos llamados: MAX_CONT, incremento
    y contador. Asigne el valor 50 a MAX_CONT y el valor 1 a contador e incremento.
    Asegúrese de declarar MAX_CONT como una variable "final".

    2. Cree un método público mostrarContador en la clase, que no reciba parámetros y retorne void. Por ejemplo:
    public void displayCount()

    3. Cree un bucle while en el método con las siguientes características:
        a. Expresión booleana: Repita si el valor de contador es menor o igual que el valor de MAX_CONT.
        b. Bloque de código:
            i. Imprima el valor de la variable contador.
            ii. Incremente el valor de la variable contador con el valor de incremento.
    Por ejemplo: contador = contador + incremento;

    4. ejecute el archivo Contador.java y observe los valores emitidos.

    5. Reescriba el algoritmo de manera de usar una sentencia do-while. Verifique que hace lo mismo.

    6. Reescriba el algoritmo de manera de usar una sentencia for. Verifique que hace lo mismo.
*/

public class contador {
    final int MAX_CONT = 50;
    int incremento, contador = 1;

    public void mostrarContador() {

        //While
        while (contador <= MAX_CONT){
            System.out.println(contador);
            contador += incremento;
        }

        //Do-While
        do{
            System.out.println(contador);
            contador += incremento;
        }
        while (contador <= MAX_CONT);

        //For
        for(contador = 0; contador <= MAX_CONT; contador += incremento){
            System.out.println(contador);
        }
    }
}


