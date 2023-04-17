package PD3;

public class main {
    public static void main(String[] args) {

        // Crear lista vacía
        Lista<String> lista = new Lista<String>();

        // Insertar elementos en la lista
        lista.insertar(new Nodo<String>("a", "Elemento a"));
        lista.insertar(new Nodo<String>("c", "Elemento c"));
        lista.insertar(new Nodo<String>("b", "Elemento b"));

        System.out.println("---------------------------------------");

        System.out.println("Lista original:");
        System.out.println(lista.imprimir(" -> "));

        System.out.println("---------------------------------------");

        lista.eliminar("c");
        System.out.println("Elimino c...");
        System.out.println("Lista actualizada:");
        System.out.println(lista.imprimir(" -> "));

        System.out.println("---------------------------------------");

        System.out.println("Busco elemento b...");
        Nodo<String> nodo = lista.buscar("b");
        if (nodo != null) {
            System.out.println("Elemento encontrado: " + nodo.getDato());
        } else {
            System.out.println("Elemento no encontrado");
        }

        System.out.println("---------------------------------------");

        System.out.println("Añadiendo d...");
        Nodo<String> nodoNuevo = new Nodo<String>("d", "Elemento d");
        lista.insertar(nodoNuevo);
        System.out.println("Lista actualizada:");
        System.out.println(lista.imprimir(" -> "));

        System.out.println("---------------------------------------");

    }
}
