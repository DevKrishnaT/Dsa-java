package SlidingWindow.revision;

public class MaxVowels {
    static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int ans = maxVowels(s, k);
        System.out.println(ans);
    }

    private static int maxVowels(String s, int k) {
        int max = 0;
        int vowelsCount = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);

            if (isVowel(curr)) {
                vowelsCount++;
            }

            if (right >= k - 1) {
                max = Math.max(max, vowelsCount);

                char c = s.charAt(left);
                if (isVowel(c)) vowelsCount--;
                left++;
            }

        }
        return max;
    }

    private static boolean isVowel(char curr) {
        return curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u';
    }
}
