package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageTimes {
    static void main(String[] args) {
        int[] arrivalTime = {0, 0, 0};
        int[] burstTime = {4, 2, 3};
        ArrayList<Double> ans = averageTimes(arrivalTime, burstTime);
        System.out.println(ans);
    }

    private static ArrayList<Double> averageTimes(int[] arrivalTime, int[] burstTime) {
        int n = arrivalTime.length;
        int[][] process = new int[n][2];

        for (int i = 0; i < n; i++) {
            process[i][0] = arrivalTime[i];
            process[i][1] = burstTime[i];
        }

        Arrays.sort(process, (a, b) -> {
            if (a[0] == b[0])
                return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int completionTime = 0;
        double totalTAT = 0;
        double totalWT = 0;

        for (int i = 0; i < n; i++) {
            completionTime += process[i][1];
            int tat = completionTime - process[i][0];
            int wt = tat - process[i][1];

            totalTAT += tat;
            totalWT += wt;
        }

        double avgTAT = Math.round((totalTAT / n) * 100.0) / 100.0;
        double avgWT = Math.round((totalWT / n) * 100.0) / 100.0;

        return new ArrayList<>(Arrays.asList(avgWT, avgTAT));
    }
}
