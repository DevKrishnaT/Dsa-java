package test;

import java.util.ArrayList;

public class Bread {
    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int total = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            if (!(list.get(i) % 2 == 0)) {

                list.set(i, list.get(i) + 1);
                list.set(i + 1, list.get(i + 1) + 1);
                total += 2;

            }

        }

        System.out.println(list);
        System.out.println(total);


        for (Integer n : list) {
            if (n % 2 != 0) {
                System.out.println("no");
                return;
            }
        }
    }
}
