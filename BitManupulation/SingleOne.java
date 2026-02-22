package BitManupulation;

public class SingleOne {
    static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 1, 5};
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println(result);
    }
}
