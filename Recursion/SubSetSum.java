package Recursion;

import java.util.ArrayList;

public class SubSetSum {
    static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        subsetSums(list, arr, 0, 0);
        System.out.println(list);
    }

    private static void subsetSums(ArrayList<Integer> list, int[] arr, int idx, int currSum) {
        if (idx == arr.length) {
            list.add(Integer.valueOf(currSum));
            return;
        }

        subsetSums(list, arr, idx + 1, currSum + arr[idx]);

        subsetSums(list, arr, idx + 1, currSum);
    }
}
