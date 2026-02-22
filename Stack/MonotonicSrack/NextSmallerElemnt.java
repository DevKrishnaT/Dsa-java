package Stack.MonotonicSrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextSmallerElemnt {
    static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        List<Integer> ans = nextSmallerEle(arr);
        System.out.println(ans);
    }

    private static List<Integer> nextSmallerEle(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                ans[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        List<Integer> list = new ArrayList<>();
        for (int num : ans) list.add(num);

        return list;

    }
}
