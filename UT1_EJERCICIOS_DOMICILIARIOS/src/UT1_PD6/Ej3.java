package UT1_PD6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ej3 {
    public static HashMap<String, String> KeyboardSet(){
        HashMap<String, String> Table = new HashMap<String, String>();
        Table.put("A", "2");
        Table.put("B", "22");
        Table.put("C", "222");
        Table.put("D", "3");
        Table.put("E", "33");
        Table.put("F", "333");
        Table.put("G", "4");
        Table.put("H", "44");
        Table.put("I", "444");
        Table.put("J", "5");
        Table.put("K", "55");
        Table.put("L", "555");
        Table.put("M", "6");
        Table.put("N", "66");
        Table.put("O", "666");
        Table.put("P", "7");
        Table.put("Q", "77");
        Table.put("R", "777");
        Table.put("S", "7777");
        Table.put("T", "8");
        Table.put("U", "88");
        Table.put("V", "888");
        Table.put("W", "9");
        Table.put("X", "99");
        Table.put("Y", "999");
        Table.put("Z", "9999");
        Table.put(" ", "0");
        Table.put(".", "1");

        return Table;
    }
    public static void transformarTextoT9(String path) throws IOException {
        FileReader reader = new FileReader(path);
        BufferedReader file = new BufferedReader(reader);

        String a = file.readLine();

        List<String> lista = Arrays.asList(a.split(" "));
        StringBuilder builder = new StringBuilder();
        for (String letter: lista) {
            for(Map.Entry<String, String> entry: KeyboardSet().entrySet()) {
                if(Objects.equals(entry.getValue(), letter)) {
                    builder.append(entry.getKey());
                    break;
                }
            }
        }
        System.out.println(builder.toString());
    }

    public static void transformarT9Texto(String path) throws IOException {
        FileReader reader = new FileReader(path);
        BufferedReader file = new BufferedReader(reader);

        String a = file.readLine();

        List<String> lista = Arrays.asList(a.split(""));
        StringBuilder builder = new StringBuilder();
        for (String letter: lista) {
            for(Map.Entry<String, String> entry: KeyboardSet().entrySet()) {
                if(entry.getKey().equalsIgnoreCase(letter)) {
                    builder.append(entry.getValue() + " ");
                    break;
                }
            }
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        try{
            transformarTextoT9("src/UT1_PD6/Ej3.txt");
            transformarT9Texto("src/UT1_PD6/Ej3b.txt");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
