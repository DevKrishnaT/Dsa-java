package test;

import java.util.ArrayList;
import java.util.List;

public class Yooo {
    static void main(String[] args) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list.get(0));
    }
}
