package lession_1.topic_group_1.maps.sortedMAp;

import java.util.SortedMap;
import java.util.TreeMap;

public class mao {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(12, "red");
        map.put(36, "yello");
        map.put(46, "tony");
        System.out.println(map);


        SortedMap<Integer, String> map2 = new TreeMap<>(((o1, o2) -> o2 - o1));
        map2.put(12, "red");
        map2.put(36, "yello");
        map2.put(46, "tony");
        System.out.println(map2);


        System.out.println(map.headMap(30));
        System.out.println(map.tailMap(30));

    }
}
