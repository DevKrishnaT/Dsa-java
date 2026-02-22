package Heap.Implimentation;

public class IsMinHeap {
    static void main(String[] args) {
        int[] nums = {10, 20, 30, 1, 23};
        Boolean ans = isMinHeap(nums);
        System.out.println(ans);
    }

    private static Boolean isMinHeap(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= (n / 2) - 1; i++) {
            int left = (i * 2) + 1;
            int right = (i * 2) + 2;
            if (left < n && nums[left] < nums[i]) {
                return false;
            }
            if (right < n && nums[right] < nums[i]) {
                return false;
            }

        }
        return true;
    }
}
