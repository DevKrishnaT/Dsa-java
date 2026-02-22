package BinarySearch;

public class MinimumNoofDaysToblom {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;// no of bouquet
        int k = 3;//no of  flowers
        int day = minDays(arr, m, k);
        System.out.println(day);
    }

    private static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;
        int min = MinimumNo(bloomDay);
        int max = maxnum(bloomDay);
        int ans = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (CanweMakeBouquet(bloomDay, mid, m, k)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    private static boolean CanweMakeBouquet(int[] bloomDay, int days, int m, int k) {
        int bouquet = 0;

        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                count++;
                if (count == k) {
                    bouquet++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquet >= m;
    }

    private static int maxnum(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
        }
        return max;
    }

    private static int MinimumNo(int[] bloomDay) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
        }
        return min;
    }
}
