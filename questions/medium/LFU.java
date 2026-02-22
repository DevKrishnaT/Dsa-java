package questions.medium;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;


class LFUCache {
    class Node {
        int key;
        int value;
        int frequency;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }


    private final int capacity;
    private int minFreq;

    private Map<Integer, Node> keyMap;                     //
    private Map<Integer, LinkedHashSet<Node>> freqMap;


    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyMap.containsKey(key)) {
            return -1;
        }

        Node node = keyMap.get(key);
        updateFreq(node);
        return node.value;
    }

    private void updateFreq(Node node) {
        int oldfreq = node.frequency;
        LinkedHashSet<Node> oldSet = freqMap.get(oldfreq);
        oldSet.remove(node);

        if (oldfreq == minFreq && oldSet.isEmpty()) {
            minFreq++;
        }
        node.frequency++;
        freqMap.computeIfAbsent(node.frequency, k -> new LinkedHashSet<>()).add(node);
    }

    private void put(int key, int value) {
        if (capacity == 0) return;

        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            updateFreq(node);
        } else {
            if (keyMap.size() == capacity) {
                LinkedHashSet<Node> minFreqNodes = freqMap.get(minFreq);
                Node nodeToRemove = minFreqNodes.iterator().next();
                minFreqNodes.remove(nodeToRemove);
                keyMap.remove(nodeToRemove.key);
            }

            Node newNode = new Node(key, value);
            keyMap.put(key, newNode);
            freqMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
            minFreq = 1;
        }
    }


}


public class LFU {
    static void main(String[] args) {


    }
}
