package test;

public class UniformArray {
    static void main(String[] args) {
        int[] nums1 = {12, 11, 9, 7};
        boolean ans = array(nums1);
        boolean ans1 = uniformArray(nums1);
        System.out.println(ans1);
    }

    private static boolean array(int[] nums1) {
        boolean isEven = true;

        for (int num : nums1) {
            if (num % 2 != 0) {
                isEven = false;
                break;
            }
        }
        if (isEven) return true;
        int smallestodd = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 != 0) {
                smallestodd = Math.min(smallestodd, num);
            }
        }

        for (int num : nums1) {
            if (num % 2 == 0 && num < smallestodd) {
                return false;
            }
        }

        return true;
    }

    public static boolean uniformArray(int[] nums) {

        int oddMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;


        for (int num : nums) {
            if (num % 2 == 0) {
                evenMin = Math.min(evenMin, num);

            } else {

                oddMax = Math.max(oddMax, num);
            }
        }


        if (oddMax == Integer.MAX_VALUE || evenMin == Integer.MAX_VALUE) {
            return true;
        }


        return oddMax < evenMin;
    }
}
