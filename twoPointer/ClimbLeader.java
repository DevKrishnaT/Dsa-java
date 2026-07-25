package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ClimbLeader {
    static void main(String[] args) {

        ArrayList<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        ArrayList<Integer> players = new ArrayList<>(Arrays.asList(5, 25, 50, 120));

        List<Integer> ans = climb(ranked, players);
        System.out.println(ans);
    }

    private static List<Integer> climb(ArrayList<Integer> ranked, ArrayList<Integer> players) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (int rank : ranked) {
            if (unique.isEmpty() || unique.get(unique.size() - 1) != rank) {
                unique.add(rank);
            }
        }
        int j = unique.size() - 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int player : players) {
            while (j >= 0 && unique.get(j) <= player) {
                j--;
            }

            list.add(j + 2);
        }
        return list;

    }
}
