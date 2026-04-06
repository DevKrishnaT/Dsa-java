package twoPointer;

public class removeDuplicatesII {
    static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int ans = removeDuplicates(nums);
        System.out.println(ans);

    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
                ;
            }
        }

        return i;
    }
}
