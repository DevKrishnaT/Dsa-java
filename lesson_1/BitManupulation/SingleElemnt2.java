package lesson_1.BitManupulation;

public class SingleElemnt2 {
    static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 2, 2, 3};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    private static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
