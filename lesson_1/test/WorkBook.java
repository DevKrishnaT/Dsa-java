package lesson_1.test;

import java.util.ArrayList;

public class WorkBook {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 5;
        int k = 3;
        int ans = workbook(n, k, list);
        System.out.println(ans);

    }

    private static int workbook(int n, int k, ArrayList<Integer> list) {
        int count = 0;
        int page = 1;
        for (int i = 0; i < n; i++) {
            int multi = 1;
            int prefiq = list.get(i);
            for (int j = 0; j <= prefiq; j++) {
                if (j <= k * multi) {
                    if (page == j) {
                        count++;
                    }
                } else {
                    page++;
                    if (page == j) {
                        count++;
                        multi++;
                    }
                }

            }
            page++;


        }
        return count;
    }
}
