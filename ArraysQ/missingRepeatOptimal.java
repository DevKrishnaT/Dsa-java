package ArraysQ;

import java.util.ArrayList;

public class missingRepeatOptimal {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 3};
        ArrayList<Integer> res = new ArrayList<>();
        int repeating = -1;
        int missing = -1;
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            System.out.println(index);

            if (arr[index] < 0) {
                repeating = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        res.add(repeating);
        res.add(missing);


    }
}
