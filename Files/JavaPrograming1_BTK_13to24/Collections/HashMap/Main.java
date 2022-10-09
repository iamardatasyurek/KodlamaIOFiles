package Collections.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictonary = new HashMap<String, String>();
        dictonary.put("door", "kapi");
        dictonary.put("book", "kitap");
        dictonary.put("table", "masa");

        for (String item : dictonary.keySet()) {
            System.out.println("Key: " + item + " - Values: " + dictonary.get(item)); 
        }

        System.out.println(dictonary.size());
        System.out.println(dictonary); // {door=kapi, book=kitap, table=masa}
        System.out.println(dictonary.get("door"));
        dictonary.remove("table");
        System.out.println(dictonary.get("table")); // null
        System.out.println(dictonary); // {door=kapi, book=kitap}
        dictonary.clear();
        System.out.println(dictonary); // {} null

    }
}
