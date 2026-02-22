package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = new ArrayList<>();
        BackTracking(list, new ArrayList<>(), arr, 0);
    }

    private static void BackTracking(List<List<Integer>> list, ArrayList<Integer> smallerList, int[] arr, int index) {
        list.add(new ArrayList<>(smallerList));

        for (int i = index; i < arr.length; i++) {
            smallerList.add(arr[i]);
            BackTracking(list, smallerList, arr, i + 1);
            smallerList.removeLast();

        }
    }
}
