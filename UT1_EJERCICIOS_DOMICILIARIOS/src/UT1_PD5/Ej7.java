package UT1_PD5;

public class Ej7 {
    /**
     * - setLength Este método establece la longitud del StringBuilder. Si newLength es menor que la longitud actual, los caracteres sobrantes se eliminan. Si newLength es mayor que la longitud actual, se agregan caracteres nulos ('\0') para alcanzar la nueva longitud.
     * - ensureCapacity Este método garantiza que el StringBuilder tenga una capacidad mínima. Si la capacidad actual es menor que minimumCapacity, la capacidad se aumenta automáticamente.
     * - append Este método agrega una cadena al final del StringBuilder. Puede tomar varios tipos de argumentos, incluyendo cadenas, caracteres, arreglos de caracteres y muchos otros.
     * - insert Este método inserta una cadena en una posición específica dentro del StringBuilder. Puede tomar varios tipos de argumentos, incluyendo cadenas, caracteres, arreglos de caracteres y muchos otros.
     * - delete Este método elimina una parte del contenido del StringBuilder, especificando un índice de inicio y un índice de finalización.
     * - deleteCharAt Este método elimina el carácter en la posición index del StringBuilder.
     * - reverse Este método invierte el orden de los caracteres en el StringBuilder.
     * */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola Mundo!");

        // Usando setLength()
        sb.setLength(4); // sb = "Hola"

        // Usando ensureCapacity()
        sb.ensureCapacity(20);

        // Usando append()
        sb.append(" Mundo!"); // sb = "Hola Mundo!"

        // Usando insert()
        sb.insert(5, "amigo "); // sb = "Hola amigo Mundo!"

        // Usando delete()
        sb.delete(5, 11); // sb = "HolaMundo!"

        // Usando deleteCharAt()
        sb.deleteCharAt(4); // sb = "HoaMundo!"

        // Usando reverse()
        sb.reverse(); // sb = "!odnuMaoH"
    }
}
