package lesson_1.collection_framework.comprater;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Descending implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class SleghtS implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {


        return o1.length() - o2.length();
    }
}

public class comprater_1 {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 34, 45, 6, 7, 78, 8);

        asList.sort(null);

        System.out.println(asList);

        asList.sort(new Descending());
        System.out.println(asList);

        List<String> String = Arrays.asList("hello", "komal", "riya", "krishna", "mummy", "papa");

        String.sort(new SleghtS());


        System.out.println(String);
    }
}


