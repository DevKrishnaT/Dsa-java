package BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        int[] num = {1, 2, 3};
        List<List<Integer>> ans = Subset(num);
    }

    private static List<List<Integer>> Subset(int[] num) {
        int n = num.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            ArrayList<Integer> Inner = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    Inner.add(num[i]);
                }
            }
            list.add(Inner);
        }

        return list;
    }
}
