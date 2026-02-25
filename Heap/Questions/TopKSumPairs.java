package Heap.Questions;

import java.util.*;

public class TopKSumPairs {
    static class Pair {
        int sum;
        int i;
        int j;

        Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }

    static void main(String[] args) {
        int[] a = {1, 4, 2, 3};
        int[] b = {2, 5, 1, 6};
        int k = 3;
        List<Integer> ans = topKSumPairs(a, b, k);
        System.out.println(ans);
    }

    private static List<Integer> topKSumPairs(int[] A, int[] B, int K) {
        int n = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
                (a, b) -> b.sum - a.sum
        );

        Set<String> visited = new HashSet<>();

        int i = n - 1;
        int j = n - 1;

        maxHeap.offer(new Pair(A[i] + B[j], i, j));
        visited.add(i + "," + j);

        List<Integer> result = new ArrayList<>();

        while (K-- > 0 && !maxHeap.isEmpty()) {
            Pair current = maxHeap.poll();
            result.add(current.sum);

            int x = current.i;
            int y = current.j;

            if (x - 1 >= 0) {
                String key = (x - 1) + "," + y;
                if (!visited.contains(key)) {
                    maxHeap.offer(new Pair(A[x - 1] + B[y], x - 1, y));
                    visited.add(key);
                }
            }

            if (y - 1 >= 0) {
                String key = x + "," + (y - 1);
                if (!visited.contains(key)) {
                    maxHeap.offer(new Pair(A[x] + B[y - 1], x, y - 1));
                    visited.add(key);
                }
            }
        }

        return result;
    }


}
