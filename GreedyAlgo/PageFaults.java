package GreedyAlgo;

import java.util.ArrayList;

public class PageFaults {
    static void main(String[] args) {
        int[] pages = {5, 0, 1, 3, 2, 4, 1, 0, 5};
        int N = 9;
        int C = 4;
        int ans = pageFaults(N, C, pages);
        System.out.println(ans);
    }

    private static int pageFaults(int n, int C, int[] pages) {
        ArrayList<Integer> list = new ArrayList<>();
        int pageFault = 0;
        for (int page : pages) {

            if (list.contains(page)) {

                list.remove((Integer) page);
                list.addLast(page);
            } else {

                if (list.size() == C) {
                    list.removeFirst();   // remove LRU
                }
                list.addLast(page);
                pageFault++;
            }
        }
        return pageFault;
    }
}
