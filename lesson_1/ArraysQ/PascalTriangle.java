package lesson_1.ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int num = 5;
        List<List<Integer>> ans = triangle(num);
        System.out.println(ans);
    }

    private static List<List<Integer>> triangle(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) return list;


        list.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = list.get(i - 1);
            List<Integer> cur = new ArrayList<>();

            cur.add(1);
            for (int j = 1; j < prev.size(); j++) {
                cur.add(prev.get(j - 1) + prev.get(j));
            }
            cur.add(1);
            list.add(cur);

        }

        return list;
    }
}
