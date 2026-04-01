package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class InterSeaction {
    static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};
        int[] ans = interseaction(num1, num2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] interseaction(int[] num1, int[] num2) {
        if (num1.length < num2.length) {
            return interseaction(num2, num1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : num1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        ArrayList<Integer> list = new ArrayList<>();
        for (int num : num2) {
            if (map.containsKey(num)) {
                list.add(num);
                map.put(num, map.get(num) - 1);
                if (map.get(num) <= 0) {
                    map.remove(num);
                }
                ;
                ;
            }
        }


        int[] res = new int[list.size()];
        int i = 0;
        while (!list.isEmpty()) {
            res[i++] = list.removeFirst();
        }

        return res;
    }
}
