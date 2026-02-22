package SlidingWindowTwoPointer;

public class NumberOfSubstrings {
    static void main(String[] args) {
        String s = "abca";
        int ans = numberOfSubstrings(s);
        System.out.println(ans);
    }

    private static int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int left = 0;
        int count = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }


    private static boolean isValid(String s) {
        return s.contains("a") && s.contains("b") && s.contains("c");
    }
}
