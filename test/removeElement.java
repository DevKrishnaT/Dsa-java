package test;

public class removeElement {
    static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int ans = remove(nums, val);
        System.out.println(ans);
    }

    private static int remove(int[] nums, int val) {
        int right = nums.length - 1;
        int left = 0;
        int k = nums.length;
        while (left <= right) {
            if (nums[right] == val) {
                right--;
                k--;
            } else if (nums[left] == val) {
                nums[left++] = nums[right];
                nums[right--] = val;
                k--;

            } else {
                left++;
            }
        }
        return k;
    }
}
