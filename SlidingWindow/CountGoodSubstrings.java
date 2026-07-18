package SlidingWindow;

public class CountGoodSubstrings {
    static void main(String[] args) {
        String s = "aababcabc";
        int ans = countGoodSubstrings(s);
        System.out.println(ans);
    }

    private static int countGoodSubstrings(String s) {
        int left = 0;
        int[] count = new int[26];
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[s.charAt(right) - 'a'] >= 2) {
                count[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 >= 3) {
                ans++;
            }

        }
        return ans;
    }
}
