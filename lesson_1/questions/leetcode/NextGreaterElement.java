package lesson_1.questions.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    static void main(String[] args) {
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] ans = nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElement(int[] num1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : num2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
            ;

        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] ans = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {

            ans[i] = map.get(num1[i]);
        }

        return ans;
    }
}
