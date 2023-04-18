package PD8;

import java.util.ArrayList;

public class Empresa {
    String name;
    ArrayList<Sucursales> sucursales = new ArrayList<Sucursales>();

    public Empresa(String name){
        this.name = name;
    }

    public String getSucursales() {
        StringBuilder sb = new StringBuilder();
        for (Sucursales sucursale : sucursales) {
            sb.append(sucursale.getLocation());
            sb.append(", ");
        }
        return sb.toString();
    }

    public int getSucursalesNum() {
        return sucursales.size();
    }

    public boolean isEmpty(){
        return sucursales.isEmpty();
    }

    public Sucursales searchSucursal(String location){
        for (int i = 0; i < sucursales.size(); i++) {
            if(sucursales.get(i).location.equalsIgnoreCase(location)){
                return sucursales.get(i);
            }
        }
        return null;
    }

    public void removeSucursal(String location){
        for (int i = 0; i < sucursales.size(); i++) {
            if(sucursales.get(i).location.equalsIgnoreCase(location)){
                sucursales.remove(sucursales.get(i));
            }
        }
    }

    public void removeSucursal(Sucursales sucu){
        sucursales.remove(sucu);
    }

    public void addSucursales(Sucursales sucu) {
        sucursales.add(sucu);
    }

    public void loadSucursales(String[] SucursalesTXT){
        for (String s : SucursalesTXT) {
            Sucursales sucursal = new Sucursales(s);
            addSucursales(sucursal);
        }
    }
}
