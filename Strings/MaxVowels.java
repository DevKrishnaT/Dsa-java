package Strings;

public class MaxVowels {
    static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int ans = maxVowels(s, k);
        System.out.println(ans);
    }

    private static int maxVowels(String s, int k) {
        int left = 0;
        int maxCount = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            count += (isVowel(s.charAt(right))) ? 1 : 0;
            if (right >= k - 1) {
                maxCount = Math.max(maxCount, count);
                count -= isVowel(s.charAt(left)) ? 1 : 0;
                left++;
            }
        }
        return maxCount;

    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
