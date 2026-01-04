package lession_1.topic_group_1.collection_framework.maps.identitymap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class hashmapI {

    public static void main(String[] args) {
        String k1 = new String("krishna");
        String k2 = new String("krishna");

        Map<String, Integer> map = new HashMap<>();
        IdentityHashMap<String, Integer> map1 = new IdentityHashMap<>();
        map.put(k1, 1);
        map.put(k2, 2);
        map1.put(k1, 1);
        map1.put(k2, 2);
        System.out.println(map);
        System.out.println(map1);
    }
}
