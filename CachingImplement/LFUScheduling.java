package CachingImplement;

import java.util.HashMap;

class LFUCache {

    class Node {
        int key;
        int value;
        int freq;

        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DoublyLinkedList {
        Node head;
        Node tail;
        int size;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;

            size = 0;
        }

        void addToEnd(Node node) {
            Node last = tail.prev;

            last.next = node;
            node.prev = last;

            node.next = tail;
            tail.prev = node;

            size++;
        }


        void remove(Node node) {

            node.prev.next = node.next;
            node.next.prev = node.prev;


            size--;

        }

        Node removeLRU() {
            Node lru = head.next;
            remove(lru);

            return lru;
        }
    }

    private int capacity;
    private int size;
    private int minFreq;
    private HashMap<Integer, Node> keySet;
    private HashMap<Integer, DoublyLinkedList> frequencySet;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        keySet = new HashMap<>();
        frequencySet = new HashMap<>();
        this.minFreq = 0;
    }

    public int get(int key) {
        if (!keySet.containsKey(key)) {
            return -1;
        }

        Node node = keySet.get(key);

        increaseFrequency(node);


        return node.value;

    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }


        if (keySet.containsKey(key)) {
            Node node = keySet.get(key);
            node.value = value;

            increaseFrequency(node);

            return;
        }


        if (capacity == size) {
            DoublyLinkedList list = frequencySet.get(minFreq);
            Node lru = list.removeLRU();

            keySet.remove(lru.key);
            size--;
        }


        Node node = new Node(key, value);


        keySet.put(key, node);

        frequencySet.computeIfAbsent(1, k -> new DoublyLinkedList()).addToEnd(node);

        minFreq = 1;

        size++;

    }

    private void increaseFrequency(Node node) {
        int oldFrequency = node.freq;

        DoublyLinkedList oldList = frequencySet.get(oldFrequency);

        oldList.remove(node);

        if (oldFrequency == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;
        frequencySet.computeIfAbsent(node.freq, k -> new DoublyLinkedList()).addToEnd(node);
    }


}

public class LFUScheduling {
    static void main(String[] args) {

    }
}
