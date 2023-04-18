package PD6;

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

        empresa.loadSucursales(leerArchivo("src/PD8/sucursales.txt"));

        System.out.println(empresa.searchSucursal("pando").location);
        System.out.println(empresa.getSucursalesNum());
        System.out.println(empresa.getSucursales());
    }
}

//Al ser 15 sucursales y el ArrayList incrementa al doble, queda en 16 para 15 sucursales. en este caso aplica