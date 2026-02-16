package lesson_1.Stack.StackDSARPoblems;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    static void main(String[] args) {
        int[] asteroid = {3, 5, -6, 2, 1, 4};
        int[] ans = asteroidCollision(asteroid);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] asteroidCollision(int[] asteroid) {
        int n = asteroid.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && asteroid[i] < 0 && stack.peek() > 0) {
                int diff = stack.peek() + asteroid[i];

                if (diff < 0) {
                    stack.pop();

                } else if (diff > 0) {
                    asteroid[i] = 0;
                } else {
                    stack.pop();
                    asteroid[i] = 0;
                }
            }

            if (asteroid[i] != 0) {
                stack.push(asteroid[i]);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
