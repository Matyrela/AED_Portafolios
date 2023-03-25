package UT1_PD10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class Ej1 {

    public static void main(String[] args) throws IOException {
        String[] Ar1 ={"Hola", "mundo", "de", "los", "algoritmos"};
        String[] Ar2 ={"Hola", "mundo", "de", "la", "informática"};

        System.out.println(Arrays.toString(palabrasComunes(Ar1, Ar2)));

        System.out.println(Arrays.toString(palabrasComunesEnLineas("src/UT1_PD10/frases.txt")));
    }

    public static String[] palabrasComunes(String[] palabras1, String[] palabras2){
        ArrayList<String> palabrasComunes = new ArrayList<String>();
        for (String palabra : palabras1) {
            if (Arrays.asList(palabras2).contains(palabra) && !palabrasComunes.contains(palabra)) {
                palabrasComunes.add(palabra);
            }
        }
        return palabrasComunes.toArray(new String[0]);
    }

    // Creo un ArrayList para almacenar las palabras comunes
    // Recorro a través de las palabras en palabras1
    // Si la palabra también está en la matriz palabras2 y aún no se ha agregado a palabrasComunes, la agrego
    // Convierto el ArrayList en un vector y la devulvo


    public static String[] palabrasComunesEnLineas(String archivo) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(archivo, "r");
        int tamañoArchivo = (int) raf.length();
        int primerIndice = (int) (Math.random() * tamañoArchivo);
        raf.seek(primerIndice);
        raf.readLine();
        String linea1 = raf.readLine();
        String linea2 = raf.readLine();
        raf.close();

        String[] palabras1 = linea1.split("\\s+");
        String[] palabras2 = linea2.split("\\s+");

        Set<String> palabrasSet = new HashSet<>(Arrays.asList(palabras1));

        List<String> palabrasComunesList = new ArrayList<>();
        for (String palabra : palabras2) {
            if (palabrasSet.contains(palabra)) {
                palabrasComunesList.add(palabra);
            }
        }
        String[] palabrasComunes = new String[palabrasComunesList.size()];
        palabrasComunes = palabrasComunesList.toArray(palabrasComunes);
        return palabrasComunes;
    }
}
