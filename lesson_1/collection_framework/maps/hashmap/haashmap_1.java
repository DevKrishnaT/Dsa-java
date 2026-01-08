package lesson_1.collection_framework.maps.hashmap;

import java.util.HashMap;

public class haashmap_1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(10, "krishna");
        hash.put(30, "mummy");
        hash.put(87, "papa");


        System.out.println(hash.get(30));

        System.out.println(hash.entrySet());

        System.out.println(hash.values());
    }
}
