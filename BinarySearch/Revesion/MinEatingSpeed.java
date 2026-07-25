package BinarySearch.Revesion;

public class MinEatingSpeed {
    static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 8;
        int ans = minEatingSpeed(piles, h);
        System.out.println(ans);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int max = maxNumPiles(piles);
        int left = 0;
        int res = max;
        while (left <= max) {
            int mid = left + (max - left) / 2;
            int hours = 0;
            for (int num : piles) {
                hours += Math.ceil((double) num / mid);
            }

            if (hours <= h) {
                res = Math.min(res, mid);
                max = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return res;


    }

    private static int maxNumPiles(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int num : piles) {
            max = Math.max(max, num);
        }
        return max;
    }
}
