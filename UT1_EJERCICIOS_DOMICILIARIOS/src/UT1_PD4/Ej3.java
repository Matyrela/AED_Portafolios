package UT1_PD4;

public class Ej3 {
    /**
     1) El siguiente código crea un array y un string. ¿Cuántas referencias a estos objetos existen luego de que el código se ha ejecutado?
     ¿Es alguno de los objetos candidato a ser eliminado por el garbage collector?

     2) Cómo hace un programa para destruir un objeto que ha creado?

     3) Dada la siguiente clase, llamada “ContenedorDeNumeros”, escribe un programa que cree una instancia de la clase,
     inicialice sus dos variables miembro y luego muestre el valor de cada una de ellas.
     */

    public static void main(String[] args) {
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
    }

    public class NumberHolder {
        public int anInt;
        public float aFloat;
    }
}
