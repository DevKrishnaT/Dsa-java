package questions.leetcode;

public class Trap {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(arr);
        System.out.println(ans);
    }

    private static int trap(int[] num) {
        int right = num.length - 1;
        int left = 0;
        int maxl = 0;
        int maxr = 0;
        int total = 0;

        while (left < right) {
            if (num[left] <= num[right]) {
                int ans = maxl - num[left];
                if (!(ans <= 0)) {
                    total += ans;
                }
                maxl = Math.max(maxl, num[left++]);
            } else {
                int ans = maxr - num[right];
                if (!(ans <= 0)) {
                    total += ans;
                }
                maxr = Math.max(maxr, num[right--]);
            }
        }
        return total;
    }
}
