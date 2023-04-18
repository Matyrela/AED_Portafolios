package PD7;

public class Lista<T> implements ILista<T> {
    private Nodo<T> primero;
    private int cantidadElementos;

    public Lista() {
        this.primero = null;
        this.cantidadElementos = 0;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (this.primero == null) {
            this.primero = nodo;
        } else {
            Nodo<T> actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
        this.cantidadElementos++;
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        Nodo<T> nodo = new Nodo<>(etiqueta, dato);
        this.insertar(nodo);
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> actual = this.primero;
        while (actual != null) {
            if (actual.getEtiqueta().equals(clave)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        Nodo<T> actual = this.primero;
        Nodo<T> anterior = null;
        while (actual != null) {
            if (actual.getEtiqueta().equals(clave)) {
                if (anterior == null) {
                    this.primero = actual.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                this.cantidadElementos--;
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        return this.imprimir(" ");
    }

    @Override
    public String imprimir(String separador) {
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = this.primero;
        while (actual != null) {
            sb.append(actual.getDato());
            sb.append(separador);
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    @Override
    public int cantElementos() {
        return this.cantidadElementos;
    }

    @Override
    public boolean esVacia() {
        return (this.primero == null);
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }
}