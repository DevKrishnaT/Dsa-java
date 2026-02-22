package BinarySearch;

import java.util.ArrayList;

public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        int ans = Kthpostitive(arr, k);
        System.out.println(ans);

    }

    private static int Kthpostitive(int[] arr, int k) {
        int max = MaxNum(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= max + k; i++) {
            list.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                list.remove(Integer.valueOf(arr[i]));
            }
        }
        return list.get(k - 1);
    }

    private static int MaxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
