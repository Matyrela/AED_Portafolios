package PD4;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        System.out.println("---------------------------- PARTE 1 ----------------------------");

        //Parte 1, leer atlas, actualizar el almacen y decir el monto de los productos

        //Leo el archivo
        String[] content = ManejadorArchivosGenerico.leerArchivo("src/PD4/ArchivosAlmacen/altas.txt");

        //Arreglo errores del archivo.
        for (int element = 0; element < content.length; element++) {
            content[element] = content[element].replaceAll("[^a-zA-Z0-9, ]", "");
        }

        //Creo el almacen
        Almacen almacen = new Almacen();

        //int de valor unitario.
        int value = 0;

        for (int e = 0; e < content.length; e++) {
            String[] actual = content[e].split(",");

            int prodID = Integer.parseInt(actual[0]);
            String prodDesc = actual[1];
            int prodPrice = Integer.parseInt(actual[2]);
            int prodCant = Integer.parseInt(actual[3]);

            value += prodPrice * prodCant;

            Producto p = new Producto(prodID, prodDesc, prodPrice, prodCant);
            almacen.insertarProducto(p);
        }


        System.out.println(almacen.getListaProductos().imprimir("\n "));
        System.out.println("Nuevo valor: $" + value);

        System.out.println("---------------------------- PARTE 2 ----------------------------");

        //Parte 2

        String[] ventas = ManejadorArchivosGenerico.leerArchivo("src/PD4/ArchivosAlmacen/ventas.txt");

        //Arreglo errores del archivo.
        for (int element = 0; element < ventas.length; element++) {
            ventas[element] = ventas[element].replaceAll("[^a-zA-Z0-9, ]", "");
        }

        int reducido = 0;

        for (int e = 0; e < ventas.length; e++) {
            String[] actual = ventas[e].split(",");

            int prodID = Integer.parseInt(actual[0]);
            int prodCant = Integer.parseInt(actual[1]);

            Nodo<Producto> producto = almacen.getListaProductos().buscar(prodID);

            reducido -= producto.getDato().getProductPrice() * prodCant;

            almacen.restarStock(prodID, prodCant);
        }


        System.out.println(almacen.getListaProductos().imprimir("\n "));
        System.out.println("Nuevo valor: $" + reducido);
    }
}
