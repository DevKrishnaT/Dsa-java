package questions;

public class SingleNumber {
    static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }

    private static int singleNumber(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }

        return ans;
    }
}
