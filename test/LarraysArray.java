package test;

import java.util.Arrays;
import java.util.List;

public class LarraysArray {
    static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 1, 2);

        System.out.println(larrysArray(arr));

    }

    public static String larrysArray(List<Integer> A) {
        int inv = 0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) > A.get(j)) {
                    inv++;
                }
            }
        }

        return (inv % 2 == 0) ? "YES" : "NO";
    }
}
