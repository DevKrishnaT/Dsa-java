package Heap.Implimentation;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUP(heap.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("heap is empty");
        }

        return heap.getFirst();
    }

    private void heapifyUP(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(parent) < heap.get(index)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }

        }
    }

    public int delete() {
        if (isEmpty()) {
            throw new RuntimeException("heap is empty");
        }

        int max = heap.getFirst();
        int last = heap.removeLast();
        if (!isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;

    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (size > index) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;
            if (left < size && heap.get(left) > heap.get(largest)) {
                largest = left;
            }
            if (right < size && heap.get(right) > heap.get(largest)) {
                largest = right;
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void swap(int index, int parent) {
        int temp = heap.get(index);
        heap.set(index, heap.get(parent));
        heap.set(parent, temp);
    }

    ;

    public List<Integer> getHeap() {
        return heap;
    }

    ;


}
