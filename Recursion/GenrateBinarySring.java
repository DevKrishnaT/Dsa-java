package Recursion;

import java.util.ArrayList;

public class GenrateBinarySring {
    static void main(String[] args) {
        int n = 3;
        ArrayList<String> list = new ArrayList<>();
        BackTracking(n, list, new StringBuilder(), 0, 0);

    }

    private static void BackTracking(int n, ArrayList<String> list, StringBuilder create, int One, int zero) {
        if (create.length() == n) {
            list.add(create.toString());
            return;

        }

        if (One < n) {
            create.append("1");
            BackTracking(n, list, create, One + 1, zero);
            create.deleteCharAt(create.length() - 1);
        }

        if (zero < n) {
            create.append("0");
            BackTracking(n, list, create, One, zero + 1);
            create.deleteCharAt(create.length() - 1);
        }
    }
}
