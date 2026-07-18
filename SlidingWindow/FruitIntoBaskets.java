package SlidingWindow;

import java.util.HashMap;

public class FruitIntoBaskets {
    static void main(String[] args) {
        int[] fruits = {0, 1, 2, 2};
        int ans = totalFruit(fruits);
        System.out.println(ans);
    }

    private static int totalFruit(int[] fruits) {
        int max = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            int num = fruits[right];
            map.put(num, map.getOrDefault(num, 0) + 1);

            while (map.size() > 2) {
                int BackNum = fruits[left];

                map.put(BackNum, map.get(BackNum) - 1);

                if (map.get(BackNum) <= 0) {
                    map.remove(BackNum);
                }

                left++;
            }
            max = Math.max(max, right - left + 1);

        }
        return max;
    }
}
