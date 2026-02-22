package lesson_1.Heap.Implementation;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUP(heap.size() - 1);
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("heap is empty");
        }

        int min = heap.getFirst();
        int last = heap.removeLast();
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        return heap.getFirst();
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }

            if (right < size && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void heapifyUP(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(parent) > heap.get(index)) {
                swap(index, parent);
                index = parent;

            } else {
                break;
            }
        }

    }

    public List<Integer> getHeap() {
        return heap;
    }


    private boolean isEmpty() {
        return heap.isEmpty();
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
