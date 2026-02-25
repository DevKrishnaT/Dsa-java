package GreedyAlgo;

import java.util.Arrays;

public class FindContentChildren {
    static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};

        int ans = findContentChildren(g, s);
        int ansTwo = findContentChildrenAns(g, s);
        System.out.println(ans);
    }

    private static int findContentChildrenAns(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }

    private static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int end = s.length;
        int ans = 0;
        for (int j : g) {

            while (start < s.length && j > s[start]) {
                start++;
            }
            if (start >= s.length) return ans;
            ans++;
            start++;

        }
        return ans;
    }
}
