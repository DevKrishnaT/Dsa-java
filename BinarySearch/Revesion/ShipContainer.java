package BinarySearch.Revesion;

public class ShipContainer {
    static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }

    private static int shipWithinDays(int[] weights, int days) {
        int left = maxElement(weights);
        int right = totalSum(weights);

        while (left < right) {
            int mid = left + (right - left) / 2;

            int daysTaken = counDays(weights, mid);

            if (daysTaken <= days) {

                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    private static int counDays(int[] weights, int mid) {
        int days = 1;
        int load = 0;
        for (int num : weights) {
            if (load + num > mid) {
                days++;
                load = num;
            } else {
                load += num;
            }
        }
        return days;
    }

    private static int totalSum(int[] weights) {
        int sum = 0;
        for (int num : weights) {
            sum += num;
        }
        return sum;
    }

    private static int maxElement(int[] weights) {
        int max = 0;
        for (int num : weights) {
            max = Math.max(max, num);
        }

        return max;
    }
}
