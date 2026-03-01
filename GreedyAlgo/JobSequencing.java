package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
    static void main(String[] args) {
        int[] deadline = {4, 1, 1, 1};
        int[] profite = {20, 10, 40, 30};

        ArrayList<Integer> ans = jobSequencing(deadline, profite);
        System.out.println(ans);
    }

    private static ArrayList<Integer> jobSequencing(int[] deadline, int[] profite) {

        int n = deadline.length;
        int[][] jobWithProfite = new int[n][2];
        for (int i = 0; i < deadline.length; i++) {
            jobWithProfite[i][0] = deadline[i];
            jobWithProfite[i][1] = profite[i];
        }
        Arrays.sort(jobWithProfite, (a, b) -> Integer.compare(b[1], a[1]));
        int max = 0;
        for (int i : deadline) {
            max = Math.max(max, i);
        }
        int[] arr = new int[max];
        Arrays.fill(arr, -1);
        int total = 0;
        int count = 0;
        for (int[] arrOfjob : jobWithProfite) {
            System.out.println(Arrays.toString(arrOfjob));
            int num = arrOfjob[0];
            int value = arrOfjob[1];
            while (num - 1 >= 0 && arr[num - 1] != -1) {
                num--;
            }
            ;
            if (num - 1 < n && num - 1 >= 0) {
                arr[num - 1] = value;
                count++;
                total += value;
            }


        }


        return new ArrayList<>(Arrays.asList(count, total));
    }
}
