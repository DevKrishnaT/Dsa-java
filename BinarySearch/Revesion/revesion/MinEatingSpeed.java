package BinarySearch.Revesion.revesion;

public class MinEatingSpeed {
    static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int ans = minEatingSpeed(piles, h);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = MaxInPiles(piles);
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int hourse = 0;
            for (int i : piles) {
                hourse += Math.ceil((double) i / mid);

            }
            if (hourse <= h) {
                ans = Math.min(ans, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }


        }

        return ans;
    }

    private static int MaxInPiles(int[] piles) {

        int max = Integer.MIN_VALUE;

        for (int num : piles) {
            max = Math.max(num, max);
        }
        return max;
    }
}
