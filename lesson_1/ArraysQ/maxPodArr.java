package lesson_1.ArraysQ;

public class maxPodArr {
    public static void main(String[] args) {
        int[] nums = {0, 2};
        int max = MaxPod(nums);
        System.out.println(max);

    }

    private static int MaxPod(int[] nums) {
        int minPod = nums[0];
        int maxPod = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxPod;
                maxPod = minPod;
                minPod = temp;
            }

            maxPod = Math.max(curr, maxPod * curr);
            minPod = Math.min(curr, minPod * curr);

            result = Math.max(result, maxPod);
        }
        return result;
    }

}
