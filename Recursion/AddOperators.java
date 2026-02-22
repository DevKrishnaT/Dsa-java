package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AddOperators {
    static void main(String[] args) {
        String num = "123";
        int target = 6;
        List<String> ans = addOperators(num, target);
        System.out.println(ans);
    }

    private static List<String> addOperators(String num, int target) {
        ArrayList<String> list = new ArrayList<>();
        calCulate(list, num, target, 0, "", 0, 0);
        return list;
    }

    private static void calCulate(ArrayList<String> list, String num, int target, int idx, String expr, long value, long prev) {
        if (idx == num.length()) {
            if (value == target) {
                list.add(expr);
            }
        }

        for (int i = idx; i < num.length(); i++) {

            if (i != idx && num.charAt(idx) == '0') break;


            long curr = Long.parseLong(num.substring(idx, i + 1));

            if (idx == 0) {
                calCulate(list, num, target, i + 1, expr + curr, curr, curr);

            } else {
                calCulate(list, num, target, i + 1,
                        expr + "+" + curr, value + curr, curr);

                calCulate(list, num, target, i + 1,
                        expr + "-" + curr, value - curr, -curr);

                calCulate(list, num, target, i + 1,
                        expr + "*" + curr,
                        value - prev + prev * curr,
                        prev * curr);
            }
        }
    }


}
