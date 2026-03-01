package GreedyAlgo;

import java.util.Arrays;

public class MinPlatform {
    static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int platforms = minPlatform(arr, dep);
        System.out.println(platforms);
    }

    private static int minPlatform(int[] arr, int[] dep) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1;
        int j = 0;
        int platform = 1;
        int max = 1;
                                                   
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platform++;
                i++;
            } else {
                platform--;
                j++;
            }
            max = Math.max(platform, max);
        }
        return max;
    }
}
