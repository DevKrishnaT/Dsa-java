package GreedyAlgo;

import java.util.HashMap;

public class LemonadeChange {
    static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20, 20};
        boolean ans = lemonadeChange(bills);
        System.out.println(ans);
    }

    private static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                if (fives == 0) return false;
                fives--;
                ten++;
            } else {

                if (ten > 0 && fives > 0) {
                    ten--;
                    fives--;
                } else if (fives >= 3) {
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean lemonadeChangeNotOptimal(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : bills) {
            int need = i - 5;
            if (need == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                continue;
            }

            if (need == 15 && map.containsKey(10)) {
                need = 5;
                map.put(10, map.get(10) - 1);
                if (map.get(10) == 0) {
                    map.remove(10);
                }
            }

            while (need != 0 && map.containsKey(5)) {
                need -= 5;
                map.put(5, map.get(5) - 1);
                if (map.get(5) == 0) {
                    map.remove(5);
                }
            }

            if (need != 0) return false;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return true;
    }
}
