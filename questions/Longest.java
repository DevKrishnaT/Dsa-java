package questions;

import java.util.Arrays;

public class Longest {
    static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 0;
        int longest = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int j = i + 1;
            while (arr[j++] == num + 1) {
                counter++;

            }

            longest = Math.max(counter, longest);


        }
        System.out.println(longest);
    }

}
