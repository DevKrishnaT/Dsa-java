package test.userInput;

public class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i + 1] = sum;
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray Arr = new NumArray(nums);
        System.out.println(Arr.sumRange(0, 2));
        System.out.println(Arr.sumRange(2, 5));
        System.out.println(Arr.sumRange(0, 5));
    }
}
