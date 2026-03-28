package LeetcodeContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountArr {
    static void main(String[] args) {
        int[] digit = {2, 49, 23};
        Arrays.sort(digit);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < digit.length; i++) {
            map.put(digit[i], new ArrayList<>());
        }

//        int courent_max = Integer.MAX_VALUE;
//        for (int dig : digit) {
//            int max_dig = 0;
//            for (int i = 0; i <= 5000; i++) {
//                int num = i;
//                int sum = 0;
//                while (num > 0) {
//                    sum += num % 10;
//                    num = num / 10;
//                }
//                if (sum == dig) {
//                    if (i <= courent_max) {
//                        map.get(dig).add(i);
//                        max_dig = Math.max(max_dig, i);
//                    }
//                }
//            }
//            courent_max = Math.min(courent_max, max_dig);
//        }
//        int max = 0;
//        for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
//            if (m.getValue().isEmpty()) {
//                return;
//            } else {
//                max = Math.max(m.getValue().size(), max);
//            }
//        }

        for (int i = 0; i <= 5000; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            if (map.containsKey(sum)) {
                map.get(sum).add(i);

            }


        }
        int min_max = 0;
        int max_min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            if (m.getValue().isEmpty()) {
                return;
            } else {
                min_max = Math.max(m.getValue().getFirst(), min_max);
                max_min = Math.min(m.getValue().getLast(), max_min);
            }
        }
        for (int dig : digit) {
            int icut = 0;

            int jcut = 0;
            for (int i = 0; i < map.get(dig).size(); i++) {

            }
        }

        System.out.println(map);
    }
}
