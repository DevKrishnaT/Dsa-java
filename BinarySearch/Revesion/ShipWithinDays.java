package BinarySearch.Revesion;

public class ShipWithinDays {
    static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }

    private static int shipWithinDays(int[] weights, int days) {
        int max = SumOfWeigths(weights);
        int left = maxWeigth(weights);

        int res = max;
        while (left <= max) {
            int mid = left + (max - left) / 2;

            int requiredDays = countDays(weights, mid);


            if (requiredDays <= days) {
                res = Math.min(res, mid);
                max = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    private static int maxWeigth(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int num : weights) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int countDays(int[] weights, int mid) {
        int days = 1;
        int load = 0;

        for (int w : weights) {

            if (load + w > mid) {
                days++;
                load = w;
            } else {
                load += w;
            }
        }

        return days;

    }

    private static int SumOfWeigths(int[] weights) {
        int sum = 0;
        for (int num : weights) {
            sum += num;
        }
        return sum;
    }
}
