package questions.leetcode;


import java.util.LinkedHashMap;
import java.util.Map;

class FixedSizeMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public FixedSizeMap(int maxSize) {
        super(16, 0.75f, true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }
}

class LRU {
    private Map<Integer, Integer> map;

    public LRU(int capacity) {
        map = new FixedSizeMap<>(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}


public class LRUCache {
    static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1));
        lru.put(3, 3);
        System.out.println(lru.get(2));

    }
}
