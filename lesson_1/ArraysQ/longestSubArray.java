package lesson_1.ArraysQ;

public class longestSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int left = 0, sum = 0, maxlen = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];


            while (sum > k) {
                sum -= arr[left];
                left++;
            }


            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        System.out.println(maxlen);


    }
}

