package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;

public class missingRepeat {
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 6};
        ArrayList<Integer> al = findTwoElement(arr);
        System.out.println(al);

    }

    private static ArrayList<Integer> findTwoElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int missing = -1;
        int repeting = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeting = arr[i];

            }
            if (arr[i + 1] - arr[i] > 1) {
                missing = arr[i] + 1;
            }

        }
        if (arr[0] != 1) {
            missing = 1;
        }
        if (arr[arr.length - 1] != arr.length) {
            missing = arr.length;
        }

        list.add(repeting);
        list.add(missing);

        return list;
    }
}
