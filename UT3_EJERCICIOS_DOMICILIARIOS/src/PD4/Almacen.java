package PD4;

public class Almacen implements IAlmacen {

    private String direccion;
    private String telefono;
    private String nombre;
    private Lista listaProductos = new Lista<Producto>();

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Lista getListaProductos() {
        return listaProductos;
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        Nodo<Producto> nodito = listaProductos.buscar(unProducto.getProductCode());
        if (nodito != null) {
            Producto productoExistente = nodito.getDato();
            productoExistente.setProductCant(productoExistente.getProductCant() + unProducto.getProductCant());
        } else {
            nodito = new Nodo<>(unProducto.getProductCode(), unProducto);
            listaProductos.insertar(nodito);
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        return listaProductos.eliminar(clave);
    }

    @Override
    public String imprimirProductos() {
        return listaProductos.toString();
    }

    @Override
    public String imprimirSeparador(String separador) {
        return null;
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        Nodo<Producto> producto = listaProductos.buscar(clave);
        if (producto != null) {
            producto.getDato().setProductCant(cantidad);
            return true;
        }
        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        Nodo<Producto> producto = listaProductos.buscar(clave);
        if (producto != null) {
            producto.getDato().setProductCant((producto.getDato().getProductCant() < cantidad) ? 0 : producto.getDato().getProductCant() - cantidad);
            return 1;
        }
        return 0;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        return (Producto) listaProductos.buscar(clave).getDato();
    }

    @Override
    public void listarOrdenadoPorNombre() {

    }

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        return null;
    }

    @Override
    public int cantidadProductos() {
        return 1;
    }
}
