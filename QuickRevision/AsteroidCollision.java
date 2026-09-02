package QuickRevision;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    static void main(String[] args) {
        int[] asteroids = {3, 5, -6, 2, -1, 4};
        int[] ans = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0) {
                int diff = asteroids[i] + stack.peek();


                if (diff < 0) {
                    stack.pop();
                } else if (diff > 0) {
                    asteroids[i] = 0;
                } else {
                    stack.pop();
                    asteroids[i] = 0;
                }
            }

            if (asteroids[i] != 0) {
                stack.push(asteroids[i]);
            }
        }


        int[] ans = new int[stack.size()];
        int i = 0;
        for (int num : stack) {
            ans[i++] = num;

        }

        return ans;


    }
}
