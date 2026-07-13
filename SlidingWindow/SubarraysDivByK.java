package SlidingWindow;

public class SubarraysDivByK {
    static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int ans = subarraysDivByK(nums, k);
        System.out.println(ans);
    }

    private static int subarraysDivByK(int[] nums, int k) {
        int left = 0;
        int total = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int temp = total;
            while (left < nums.length && temp >= k) {
                if (temp == k) {
                    count++;
                }

                temp -= nums[left];
                left++;
            }

        }

        return count;
    }
}
