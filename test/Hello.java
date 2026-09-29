package test;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("My world");
        String s = "krishna";
        List<List<Integer>> list = new ArrayList<>();

        solve(s, list, new ArrayList<>());
    }

    private static void solve(String s, List<List<Integer>> list, ArrayList<Integer> ans) {

        list.add(new ArrayList<>(ans));
    }


}
