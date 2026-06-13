package ArraysQ;

public class rotatedSorted {
    static void main(String[] args) {
        int[] arr = {3, 1};
        boolean ans = check(arr);
        System.out.println(ans);
    }

    private static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
