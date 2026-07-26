package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Element {
    int number;
    int dis;

    Element(int number, int dis) {
        this.number = number;
        this.dis = dis;
    }
}

public class FindClosestElements {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> ans = findClosestElements(arr, k, x);
        System.out.println(ans);
    }


    private static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Element> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.dis == b.dis) {
                        return Integer.compare(a.number, b.number);
                    }
                    return Integer.compare(a.dis, b.dis);
                });


        for (int num : arr) {
            pq.offer(new Element(num, Math.abs(num - x)));
        }

        List<Integer> list = new ArrayList<>();

       
        while (k-- > 0 && !pq.isEmpty()) {
            list.add(pq.poll().number);
        }

        Collections.sort(list);

        return list;
    }
}
