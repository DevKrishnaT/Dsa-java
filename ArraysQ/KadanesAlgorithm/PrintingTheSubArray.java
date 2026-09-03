package ArraysQ.KadanesAlgorithm;

public class PrintingTheSubArray {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printingSubArray(nums);
    }

    private static void printingSubArray(int[] nums) {
        for (int st = 0; st < nums.length; st++) {

            for (int lst = st; lst < nums.length; lst++) {
                System.out.print("[");
                for (int i = st; i <= lst; i++) {

                    System.out.print(" " + nums[i]);
                }
                System.out.print(" ]");
            }
            System.out.println();
        }
    }
}
