package lesson_1.BinarySearch;

public class KokoBanana {
    public static void main(String[] args) {
        int[] arr = {30, 11, 23, 4, 20};
        int h = 5;
        int k = minEatingSpeed(arr, h);
        System.out.println(k);
    }

    private static int minEatingSpeed(int[] piles, int h) {

        int max = MaximumNum(piles);

        int low = 1;
        int res = max;
        while (low <= max) {
            int mid = low + (max - low) / 2;
            int hourse = 0;
            for (int i : piles) {
                hourse += Math.ceil((double) i / mid);

            }

            if (hourse <= h) {
                res = Math.min(res, mid);
                max = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    private static int MaximumNum(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

}
