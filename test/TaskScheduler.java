package test;

public class TaskScheduler {
    static void main(String[] args) {
        char[] nums = {'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;
        int ans = leastInterval(nums, n);
        System.out.println(ans);
    }

    private static int leastInterval(char[] nums, int n) {
        int[] freq = new int[26];
        for (char c : nums) {
            freq[c - 'A']++;
        }

        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int maxCount = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                maxCount++;
            }
        }

        return Math.max(nums.length, (maxFreq - 1) * (n + 1) + maxCount);
    }
}
