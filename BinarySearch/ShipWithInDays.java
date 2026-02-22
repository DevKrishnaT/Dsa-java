package BinarySearch;


public class ShipWithInDays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int capacity = shipWithinDays(nums, days);
        System.out.println(capacity);
    }

    private static int shipWithinDays(int[] weights, int days) {

        int left = maxNum(weights);
        int right = sum(weights);
        int res = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ShipedWithCapacity(weights, mid, days)) {
                res = Math.min(res, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return res;

    }

    private static int sum(int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        return sum;
    }

    private static boolean ShipedWithCapacity(int[] weights, int capacity, int days) {
        int daysUsed = 1;
        int currentLoad = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] > capacity) {
                daysUsed++;
                currentLoad = 0;
            }
            currentLoad += weights[i];
        }

        return daysUsed <= days;
    }

    private static int maxNum(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
        }
        return max;
    }
}
