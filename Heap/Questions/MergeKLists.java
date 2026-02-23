package Heap.Questions;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class HeapMinNode {

    private ArrayList<ListNode> heap;

    public HeapMinNode() {
        heap = new ArrayList<>();
    }

    public void insert(ListNode node) {
        heap.add(node);
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(index).val < heap.get(parent).val) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    public ListNode delete() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        ListNode min = heap.get(0);
        ListNode last = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }

        return min;
    }

    private void heapifyDown(int index) {
        int size = heap.size();

        while (true) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int smallest = index;

            if (left < size && heap.get(left).val < heap.get(smallest).val) {
                smallest = left;
            }

            if (right < size && heap.get(right).val < heap.get(smallest).val) {
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

    private void swap(int i, int j) {
        ListNode temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}

public class MergeKLists {

    public static void main(String[] args) {

        ListNode l1 = buildList(new int[]{1, 4, 5});
        ListNode l2 = buildList(new int[]{1, 3, 4});
        ListNode l3 = buildList(new int[]{2, 6});

        ListNode[] lists = {l1, l2, l3};

        MergeKLists obj = new MergeKLists();
        ListNode result = obj.mergeKLists(lists);

        printList(result);
    }

    public ListNode mergeKLists(ListNode[] lists) {

        HeapMinNode heap = new HeapMinNode();


        for (ListNode node : lists) {
            if (node != null) {
                heap.insert(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!heap.isEmpty()) {
            ListNode minNode = heap.delete();

            current.next = minNode;
            current = current.next;

            if (minNode.next != null) {
                heap.insert(minNode.next);
            }
        }

        return dummy.next;
    }


    static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }


    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}