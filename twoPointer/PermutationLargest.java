package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PermutationLargest {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> ans = findLargest(list, 3);
    }

    private static List<Integer> findLargest(List<Integer> arr, int k) {
        int n = arr.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), i);
        }

        for (int i = 0; i < n && k > 0; i++) {

            int currentValue = arr.get(i);
            int maxValue = n - i;
            if (currentValue == maxValue) {
                continue;
            }

            int maxIndex = arr.get(maxValue);


            arr.set(i, maxValue);
            arr.set(maxIndex, currentValue);


            map.put(maxValue, i);
            map.put(currentValue, maxIndex);
            k++;

        }

        return arr;
    }
}
