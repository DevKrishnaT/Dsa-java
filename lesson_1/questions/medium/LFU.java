package lesson_1.questions.medium;

import java.util.LinkedHashMap;
import java.util.Map;

class FixedSizeMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public FixedSizeMap(int maxSize) {
        super(16, 0.75f, false);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }
}

class LFUCache {
    private Map<Integer, Integer> map;

    public LFUCache(int capacity) {
        map = new FixedSizeMap<>(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}

public class LFU {
    static void main(String[] args) {
        LFUCache lfu = new LFUCache(3);
        lfu.put(1, 1);
        lfu.put(2, 2);
        System.out.println(lfu.get(1));
        lfu.put(3, 3);
        System.out.println(lfu.get(2));
        lfu.put(4, 4);
        System.out.println(lfu.get(1));
    }
}
