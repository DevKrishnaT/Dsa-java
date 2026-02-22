package lesson_1.Heap.Implementation;

import java.util.List;

public class HeapPrinter {
    public static void printTree(List<Integer> heap) {
        if (heap == null || heap.isEmpty()) {
            System.out.println("(empty heap)");
            return;
        }

        int level = 0;
        int index = 0;

        while (index < heap.size()) {
            int nodesInLevel = (int) Math.pow(2, level);

            for (int i = 0; i < nodesInLevel && index < heap.size(); i++) {
                System.out.print(heap.get(index) + " ");
                index++;
            }

            System.out.println();
            level++;
        }
    }
}
