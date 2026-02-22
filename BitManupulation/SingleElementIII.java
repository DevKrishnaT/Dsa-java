package BitManupulation;

public class SingleElementIII {
    static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 5};
        int[] ans = singleNumber(arr);
    }

    private static int[] singleNumber(int[] nums) {
        int XorAll = 0;
        for (int num : nums) {
            XorAll ^= num;

        }

        int mask = XorAll & -XorAll;

        int a = 0, b = 0;
        for (int n : nums) {
            if ((n & mask) == 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}
