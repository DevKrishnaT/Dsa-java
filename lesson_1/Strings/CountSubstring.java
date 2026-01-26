package lesson_1.Strings;

import java.util.Arrays;

public class CountSubstring {
    public static void main(String[] args) {
        String s = "abcabc";
        int ans = countSubstring(s);
        System.out.println(ans);
    }

    private static int countSubstring(String s) {
        int[] arr = new int[3];
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'a']++;
            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                ans += s.length() - right;
                arr[s.charAt(left) - 'a']--;
                left++;

            }

        }
        return ans;
    }


}
