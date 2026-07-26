package BinarySearch.Revesion;

public class BouquetsMake {
    static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int ans = minDays(bloomDay, m, k);
        System.out.println(ans);
    }

    private static int minDays(int[] bloomDay, int m, int k) {
        int left = minNumDays(bloomDay);
        int right = maxNumDays(bloomDay);
        int res = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (findbouquetbuild(bloomDay, k, mid) >= m) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }


        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static int minNumDays(int[] bloomDay) {
        int min = Integer.MAX_VALUE;
        for (int num : bloomDay) {
            min = Math.min(num, min);
        }
        return min;
    }

    private static int findbouquetbuild(int[] bloomDay, int k, int mid) {
        int flowers = 0;
        int bouquets = 0;

        for (int day : bloomDay) {

            if (day <= mid) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                flowers = 0;
            }
        }

        return bouquets;
    }

    private static int maxNumDays(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int num : bloomDay) {
            max = Math.max(num, max);
        }
        return max;
    }
}
