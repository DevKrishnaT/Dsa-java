package Heap.Questions;

import java.util.ArrayList;
import java.util.Collections;

class MedianFinder {
    private ArrayList<Integer> list;
    private int total;

    public MedianFinder() {
        list = new ArrayList<>();
        total = 0;
    }

    public void addNum(int num) {
        list.add(num);
        total += num;
    }

    public double findMedian() {
        Collections.sort(list);
        int n = list.size();

        if (n % 2 == 1) {
            return list.get(n / 2);
        } else {
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }
    }
}

public class MedianFinderQ {
    static void main(String[] args) {
        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        System.out.println(finder.findMedian());
        finder.addNum(3);
        System.out.println(finder.findMedian());
    }

}
