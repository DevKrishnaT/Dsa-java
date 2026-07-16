package SlidingWindow;

public class MaxVowels {
    static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int ans = maxVowels(s, k);
        System.out.println(ans);
    }

    private static int maxVowels(String s, int k) {
        int Maxvov = 0;
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);

            if (compare(curr)) {
                count++;
            }
            if (right >= k - 1) {
                Maxvov = Math.max(Maxvov, count);

                char backCurr = s.charAt(left);
                if (compare(backCurr)) count--;
                left++;
            }
        }
        return Maxvov;
    }

    public static boolean compare(char c) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        for (char curr : arr) {
            if (curr == c) {
                return true;
            }
        }
        return false;
    }
}
