package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ProdOfEven {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int ans = prodOfEvenNum(0, list);
        System.out.println(ans);
    }

    private static int prodOfEvenNum(int i, ArrayList<Integer> list) {
        if (i == list.size()) return 1;

        int value = 1;
        if (list.get(i) % 2 == 0) {
            value = list.get(i);
        }
        return prodOfEvenNum(i + 1, list) * value;
    }
}
