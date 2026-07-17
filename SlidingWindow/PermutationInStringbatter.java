package SlidingWindow;

public class PermutationInStringbatter {
    static void main(String[] args) {
        String s1 = "odibe";
        String s2 = "eidboaoo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    private static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int nonZeros = 0;
        for (int num : count) {
            if (num != 0) {
                nonZeros++;
            }
        }

        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            int idx = s2.charAt(right) - 'a';

            if (count[idx] == 1) {
                nonZeros--;
            } else if (count[idx] == 0) {
                nonZeros++;
            }
            count[idx]--;
            if (right >= s1.length() - 1) {
                idx = s2.charAt(left) - 'a';
                if (nonZeros == 0) {
                    return true;
                }

                if (count[idx] == -1) {
                    nonZeros--;
                } else if (count[idx] == 0) {
                    nonZeros++;
                }


                count[idx]++;
                left++;
            }


        }
        return false;
    }
}
