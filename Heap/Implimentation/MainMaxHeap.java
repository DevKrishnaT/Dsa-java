package Heap.Implimentation;

public class MainMaxHeap {
    static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.insert(10);
        heap.insert(24);
        heap.insert(14);
        heap.insert(49);
        heap.insert(43);
        heap.insert(243);
        heap.insert(23);
        heap.insert(94);
        heap.insert(12);
        heap.insert(493);
        HeapPrinter.printTree(heap.getHeap());
    }
}
