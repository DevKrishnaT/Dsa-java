package ArraysQ;


import java.util.HashSet;

public class consecutiveSeq {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }


        int longest = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int strike = 1;
                while (set.contains(current + 1)) {
                    current++;
                    strike++;
                }
                longest = Math.max(longest, strike);
            }

        }


    }
}
