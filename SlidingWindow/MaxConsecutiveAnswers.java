package SlidingWindow;

public class MaxConsecutiveAnswers {
    static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 1;
        int ans = maxConsecutiveAnswers(answerKey, k);
        System.out.println(ans);
    }

    private static int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0;
        int T = 0;
        int F = 0;
        int max = 0;
        for (int right = 0; right < answerKey.length(); right++) {
            char c = answerKey.charAt(right);

            if (c == 'T') {
                T++;
            } else {
                F++;
            }


            while ((right - left + 1) - Math.max(T, F) > k) {
                c = answerKey.charAt(left);

                if (c == 'T') {
                    T--;
                } else {
                    F--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);


        }
        return max;
    }
}
