package BinarySearch;

import java.util.Arrays;

public class AgresiveCow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        int k = 3;
        int ans = aggressiveCows(arr, k);
        System.out.println(ans);
    }

    private static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int max = stalls[stalls.length - 1];
        int left = 1;
        int right = max - stalls[0];
        int ans = Integer.MIN_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(stalls, k, mid)) {
                ans = Math.max(ans, mid);
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
        return ans;
    }

    private static boolean isValid(int[] stalls, int k, int mid) {
        int cow = 1;
        int lastCow = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCow >= mid) {
                cow++;
                lastCow = stalls[i];
            }
            if (cow == k) {
                return true;
            }

        }
        return false;

    }
}
