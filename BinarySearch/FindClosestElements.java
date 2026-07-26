package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {
    static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> ans = findClosestElements(arr, k, x);
        System.out.println(ans);
    }

    private static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (r - l + 1 > k) {
            if (Math.abs(arr[l] - x) > Math.abs(arr[r] - x)) {
                l++;
            } else {
                r--;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}
