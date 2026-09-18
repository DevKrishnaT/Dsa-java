package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameOftwoStacks {
    static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 8, 1, 2));
        Collections.reverse(list1);
        Collections.reverse(list2);
        int max = 5;
        int ans = maxSum(list1, list2, max);
        System.out.println(ans);

    }

    private static int maxSum(List<Integer> list1, List<Integer> list2, int max) {
        int sum = 0;
        int i = 0;
        int maxCount = 0;
        while (i < list1.size() && sum + list1.get(i) <= max) {
            sum += list1.get(i);
            i++;
        }


        int j = 0;
        while (j < list2.size()) {

            sum += list2.get(j);
            j++;

            while (sum > max && i > 0) {
                i--;
                sum -= list1.get(i);
            }
            
            if (sum <= max) {
                maxCount = Math.max(maxCount, i + j);
            }
        }
        return maxCount;
    }
}
