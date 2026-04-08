package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySumk {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;
        ArrayList<Integer> ans = subarraySum(arr, k);
        System.out.println(ans);
    }

    private static ArrayList<Integer> subarraySum(int[] arr, int k) {
        int i = 0;
        int j = i;
        int sum = 0;
        while (i < arr.length && j < arr.length) {
            sum += arr[j++];

            if (sum > k && i < j) {
                while (sum > k) {
                    sum -= arr[i++];
                }
            }
            if (sum == k) {
                return new ArrayList<>(Arrays.asList(i + 1, j));
            }
        }

        return new ArrayList<>(List.of(-1));
    }
}
