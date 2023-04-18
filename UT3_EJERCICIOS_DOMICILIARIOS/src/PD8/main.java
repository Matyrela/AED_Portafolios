package PD8;

import static PD8.Util.leerArchivo;

/**
 * • Agregar una sucursal ✓
 * • Buscar una sucursal ✓
 * • Quitar una sucursal ✓
 * • Listar todas las sucursales ✓
 * • Indicar la cantidad de sucursales ✓
 * • Indicar si el directorio de sucursales está o no vacío ✓
 */

public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("EstructurasYAlgoritmos");

        empresa.loadSucursales(leerArchivo("src/PD6/suc2.txt"));
        empresa.removeSucursal("Shenzhen");
        empresa.removeSucursal("Tokio");

        System.out.println(empresa.getSucursales());
    }
}

/**
 * Ej 1:
 * 107
 *
 * Ej 2:
 * Shenzhen
 *
 * Ej3:
 * Queda vacia.
 */