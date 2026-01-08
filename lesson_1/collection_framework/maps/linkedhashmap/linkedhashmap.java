package lesson_1.collection_framework.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lh1 = new LinkedHashMap<>(16, 0.3f, true);

        lh1.put(19, "Krishna");
        lh1.put(68, "pony");
        lh1.put(67, "tony");
        lh1.get(19);


        for (Map.Entry<Integer, String> set : lh1.entrySet()) {
            System.out.println("key: " + set.getKey() + " value " + set.getValue());
        }


    }
}
