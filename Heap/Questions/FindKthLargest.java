package Heap.Questions;

import java.util.ArrayList;

class HeapMax {
    private ArrayList<Integer> heap;

    public HeapMax() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int delete() {
        if (isEmpty()) {
            throw new RuntimeException("Empty heap");
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
            int left = (index * 2) + 1;
            int right = (index * 2) + 2;
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

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) > heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }

        }
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }

        return heap.getFirst();
    }

    private void swap(int index, int parent) {
        int temp = heap.get(index);
        heap.set(index, heap.get(parent));
        heap.set(parent, temp);
    }

    private boolean isEmpty() {
        return heap.isEmpty();
    }
}

public class FindKthLargest {
    static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ans = findKthLargest(nums, k);
        System.out.println(ans);

    }

    private static int findKthLargest(int[] nums, int k) {
        HeapMax heap = new HeapMax();
        for (int i : nums) {
            heap.insert(i);
        }

        while (k - 1 > 0) {
            heap.delete();
            k--;
        }

        return heap.peek();
    }
}
