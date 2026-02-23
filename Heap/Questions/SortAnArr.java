package Heap.Questions;

import java.util.ArrayList;
import java.util.Arrays;

class HeapMin {
    private ArrayList<Integer> heap;

    public HeapMin() {
        heap = new ArrayList<>();
    }

    public void inset(int value) {
        heap.add(value);
        HeapifyUp(heap.size() - 1);
    }

    private void HeapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) < heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    public int delete() {
        if (isEmpty()) {
            throw new RuntimeException("Empty");
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
        while (index < size) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;

            if (left < size && heap.get(left) < heap.get(largest)) {
                largest = left;
            }

            if (right < size && heap.get(right) < heap.get(largest)) {
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

    private void swap(int index, int parent) {
        int temp = heap.get(index);
        heap.set(index, heap.get(parent));
        heap.set(parent, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

}

public class SortAnArr {
    static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        int[] ans = sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortArray(int[] nums) {
        HeapMin heap = new HeapMin();

        for (int i : nums) {
            heap.inset(i);
        }

        int[] ans = new int[nums.length];
        int i = 0;
        while (!heap.isEmpty()) {
            ans[i++] = heap.delete();
        }
        return ans;
    }
}
