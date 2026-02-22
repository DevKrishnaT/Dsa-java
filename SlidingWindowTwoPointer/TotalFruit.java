package SlidingWindowTwoPointer;

import java.util.HashMap;

public class TotalFruit {
    static void main(String[] args) {
        int[] fruits = {0, 0, 1, 1};
        int ans = totalFruit(fruits);
        System.out.println(ans);
    }

    private static int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;


        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);

                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
