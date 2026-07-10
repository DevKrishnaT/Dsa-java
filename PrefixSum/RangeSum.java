package PrefixSum;

public class RangeSum {
    void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray(nums);
    }

    private int[] prefix;

    public void NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
